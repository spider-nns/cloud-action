package com.spider.grpc.server.service;

import com.spider.grpc.lib.GreeterGrpc;
import com.spider.grpc.lib.GreeterOuterClass;
import io.grpc.stub.StreamObserver;
import lombok.extern.slf4j.Slf4j;
import net.devh.springboot.autoconfigure.grpc.server.GrpcService;

@Slf4j
@GrpcService(GreeterOuterClass.class)
public class GreeterService extends GreeterGrpc.GreeterImplBase {

    @Override
    public void sayHello(GreeterOuterClass.HelloRequest request, StreamObserver<GreeterOuterClass.HelloReply> responseObserver) {
        String msg = "hi " + request.getName() + "!";
        GreeterOuterClass.HelloReply.Builder replyBuilder = GreeterOuterClass.HelloReply.newBuilder().setMessage(msg);
        responseObserver.onNext(replyBuilder.build());
        responseObserver.onCompleted();
        log.info("resp: {}", msg);
    }
}
