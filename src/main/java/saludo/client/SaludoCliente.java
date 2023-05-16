package saludo.client;

import com.proto.saludo.SaludoRequest;
import com.proto.saludo.SaludoResponse;
import com.proto.saludo.SaludoServiceGrpc;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import io.grpc.stub.CallStreamObserver;
import io.grpc.stub.StreamObserver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

public class SaludoCliente {

    public static void main(String[] args) throws InterruptedException {
        ManagedChannel ch = ManagedChannelBuilder
                .forAddress("localhost", 50051)
                .usePlaintext()
                .build();

        saludarUnario(ch);

        //recibirSaludoStream(ch);

        //enviarSaludosStream(ch);

        //saludoStreamBidireccional(ch);

        System.out.println("Apagando..");
        ch.shutdown();
    }

    public static void saludarUnario(ManagedChannel ch){
        SaludoServiceGrpc.SaludoServiceBlockingStub stub =
                SaludoServiceGrpc.newBlockingStub(ch);
        SaludoResponse response =
                stub.saludo(SaludoRequest
                        .newBuilder()
                        .setNombre("SAUL")
                        .build());

        System.out.println("SALUDO: "+response.getResult());
    }

    public static void recibirSaludoStream(ManagedChannel ch){
        System.out.println("-----------------------");
        SaludoServiceGrpc.SaludoServiceBlockingStub stub = SaludoServiceGrpc.newBlockingStub(ch);
        stub.saludoMuchasVeces(SaludoRequest.newBuilder().setNombre("Saul").build())
                .forEachRemaining(respose->{
                    System.out.println(respose.getResult());
                });
    }

    public static void enviarSaludosStream(ManagedChannel ch) throws InterruptedException {
        System.out.println("-----------------------");
        SaludoServiceGrpc.SaludoServiceStub stub = SaludoServiceGrpc.newStub(ch);

        List<String> nombres = new ArrayList<>();

        CountDownLatch latch = new CountDownLatch(1);

        Collections.addAll(nombres, "Adrian","Dario","Eduardo","Gabriel","Alberto","Brandon","David",
                "Esteban","Estefania","Kevin","Gloria","Luisa","Kristel","Samuel","Juan");

        StreamObserver<SaludoRequest> stream = stub.saludoStream(new StreamObserver<SaludoResponse>() {
            @Override
            public void onNext(SaludoResponse response) {
                System.out.println(response.getResult());
            }

            @Override
            public void onError(Throwable t) {}

            @Override
            public void onCompleted() {
                latch.countDown();
            }
        });

        for(String nomb : nombres){
            stream.onNext(SaludoRequest.newBuilder().setNombre(nomb).build());
        }

        stream.onCompleted();

        latch.await(3,TimeUnit.SECONDS);
    }

    public static void saludoStreamBidireccional(ManagedChannel ch) throws InterruptedException {
        SaludoServiceGrpc.SaludoServiceStub stub = SaludoServiceGrpc.newStub(ch);
        List<String> nombres = new ArrayList<>();

        CountDownLatch latch = new CountDownLatch(1);

        Collections.addAll(nombres, "Adrian","Dario","Eduardo","Gabriel","Alberto","Brandon","David",
                "Esteban","Estefania","Kevin","Gloria","Luisa","Kristel","Samuel","Juan");

        StreamObserver<SaludoRequest> stream =
                stub.saludoStreamBidireccional(new StreamObserver<SaludoResponse>() {
            @Override
            public void onNext(SaludoResponse response) {
                System.out.println(response.getResult());
            }

            @Override
            public void onError(Throwable t) {}

            @Override
            public void onCompleted() {
                latch.countDown();
            }
        });

        nombres.forEach(n->{
            stream.onNext(SaludoRequest.newBuilder().setNombre(n).build());
        });

        stream.onCompleted();

        latch.await(3,TimeUnit.SECONDS);

    }

}
