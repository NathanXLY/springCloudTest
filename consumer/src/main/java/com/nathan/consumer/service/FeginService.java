package com.nathan.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "producer")
public interface FeginService {

    @GetMapping("/info/{callerName}")
    String info(@PathVariable String callerName) ;
}
