package saludo.server;

import com.proto.saludo.SaludoRequest;
import com.proto.saludo.SaludoResponse;
import com.proto.saludo.SaludoServiceGrpc;
import io.grpc.stub.StreamObserver;

public class SaludoServerImpl extends SaludoServiceGrpc.SaludoServiceImplBase {

    @Override
    public void saludo(SaludoRequest request, StreamObserver<SaludoResponse> responseObserver) {
        responseObserver.onNext(SaludoResponse.newBuilder()
                .setResult("HOLA "+request.getNombre())
                .build());
        responseObserver.onCompleted();
    }

    @Override
    public void saludoMuchasVeces(SaludoRequest request, StreamObserver<SaludoResponse> responseObserver) {
        //Envio stream de saludos
        for(int i = 1; i <= 10; i++){
            responseObserver.onNext(
                    SaludoResponse.newBuilder()
                            .setResult("Hi "+request.getNombre()+" "+i+" time")
                            .build()
            );
        }
        responseObserver.onCompleted();
    }

    @Override
    public StreamObserver<SaludoRequest> saludoStream(StreamObserver<SaludoResponse> responseObserver) {
        StringBuilder sb = new StringBuilder();

        return new StreamObserver<SaludoRequest>() {
            @Override
            public void onNext(SaludoRequest request) {
                sb.append("HOLA ");
                sb.append(request.getNombre());
                sb.append("!\n");
            }

            @Override
            public void onError(Throwable t) {
                responseObserver.onError(t);
            }

            @Override
            public void onCompleted() {
                responseObserver.onNext(SaludoResponse.newBuilder()
                        .setResult(sb.toString()).build());
                responseObserver.onCompleted();
            }
        };
    }

    @Override
    public StreamObserver<SaludoRequest> saludoStreamBidireccional(StreamObserver<SaludoResponse> responseObserver) {
        return new StreamObserver<SaludoRequest>() {
            @Override
            public void onNext(SaludoRequest request) {
                responseObserver.onNext(SaludoResponse.newBuilder()
                        .setResult("HOLA "+request.getNombre()+"!\n").build());
            }

            @Override
            public void onError(Throwable t) {
                responseObserver.onError(t);
            }

            @Override
            public void onCompleted() {
                responseObserver.onCompleted();
            }
        };
    }
}
