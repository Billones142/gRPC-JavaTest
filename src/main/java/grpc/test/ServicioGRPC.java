package grpc.test;

import grpc.test.interfaces.MiServicio;

public class ServicioGRPC extends MyServiceGrpc.MyServiceImplBase implements MiServicio{
    private MyServiceStub stub;

    public MyServiceClient(ManagedChannel channel) {
        this.stub = MyServiceGrpc.newStub(channel);
    }

    public String hello(String name) {
        return stub.hello(name);
    }
}
