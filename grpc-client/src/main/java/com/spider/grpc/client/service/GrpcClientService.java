package com.spider.grpc.client.service;

import com.spider.grpc.lib.GreeterGrpc;
import com.spider.grpc.lib.GreeterOuterClass;
import io.grpc.Channel;
import lombok.extern.slf4j.Slf4j;
import net.devh.springboot.autoconfigure.grpc.client.GrpcClient;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class GrpcClientService {
    @GrpcClient("local-grpc-server")
    private Channel serverChannel;

    public String sendMsg(String name) {
        GreeterGrpc.GreeterBlockingStub stub = GreeterGrpc.newBlockingStub(serverChannel);
        GreeterOuterClass.HelloReply helloReply = stub.sayHello(GreeterOuterClass.HelloRequest.newBuilder().
                setName(name).build());
        return helloReply.getMessage();
    }
}
