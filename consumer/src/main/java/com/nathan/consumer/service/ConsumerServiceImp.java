package com.nathan.consumer.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerServiceImp {
    @Autowired private RestTemplate restTemplate ;

    public JSONObject getRestData(String name){
        return restTemplate.getForObject("http://producer/hello", JSONObject.class) ;
    }
}
