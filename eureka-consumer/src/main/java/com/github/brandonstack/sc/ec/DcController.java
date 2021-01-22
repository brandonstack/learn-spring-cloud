package com.github.brandonstack.sc.ec;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DcController {
    @Autowired
    LoadBalancerClient loadBalancerClient;

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/consumer")
    public String dc() {
        final ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
        final String url = String.format("http://%s:%d/dc", serviceInstance.getHost(), serviceInstance.getPort());
        return restTemplate.getForObject(url, String.class);
    }
}
