package com.nathan.consumer.controller;

import com.nathan.consumer.service.ConsumerServiceImp;
import com.nathan.consumer.service.FeginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @Autowired
    private ConsumerServiceImp restfulService ;

    @Autowired
    private FeginService feginService;

    @Value("${server.port}")
    String port ;
    @Value("${spring.application.name}")
    String name ;

    @RequestMapping("/home")
    public String home(@RequestParam String name){
        return "I am info from port("+port+") from application name("+name+") invoke other service." + "\n"
                +restfulService.getRestData(name);
    }

    @RequestMapping("fegin")
    public String fegin(){
        return "I am info from port("+port+") from application name("+name+") invoke other service." + "\n"
                +feginService.info(name);
    }
}
