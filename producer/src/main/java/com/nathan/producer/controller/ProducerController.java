package com.nathan.producer.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProducerController {

    @Value("${server.port}")
    String port;
    @Value("${spring.application.name}")
    String name;

    @GetMapping(value = "/hello")
    public JSONObject controller() {
        JSONObject result = new JSONObject();
        result.put("data", "hello from " + name + " port:" + port);
        return result;
    }

    @GetMapping(value = "/info/{callerName}")
    public JSONObject infoController(@PathVariable String callerName) {
        JSONObject result = new JSONObject();
        result.put("data", "调用方" + callerName + " service " + name + " port:" + port);
        return result;
    }
}
