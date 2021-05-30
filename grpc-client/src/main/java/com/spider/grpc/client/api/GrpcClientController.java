package com.spider.grpc.client.api;

import com.spider.grpc.client.service.GrpcClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GrpcClientController {

    @Autowired
    private GrpcClientService grpcClientService;

    @GetMapping("/hi")
    public String printMessage(@RequestParam(name = "name", defaultValue = "spider") String name) {
        return grpcClientService.sendMsg(name);
    }
}
