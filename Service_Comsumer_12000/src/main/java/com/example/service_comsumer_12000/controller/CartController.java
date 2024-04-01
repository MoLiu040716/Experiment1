package com.example.service_comsumer_12000.controller;

import com.example.service_comsumer_12000.entity.CommonResult;
import com.example.service_comsumer_12000.entity.User;
import jakarta.annotation.Resource;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/cart")
public class CartController {
    @Resource
    private RestTemplate restTemplate;

    @Resource
    private DiscoveryClient discoveryClient;

    @GetMapping("/getCartById/{userId}")
    public CommonResult<User> getCartById(@PathVariable("userId") Integer userId){

        CommonResult<User> result = restTemplate.getForObject(
                "http://provider-server/user/getUserById/"+userId.toString()
                ,CommonResult.class);
        return result;
    }
}
