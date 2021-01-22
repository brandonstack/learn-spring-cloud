package com.github.brandonstack.sc.ecf;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class EurekaConsumerFeignApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaConsumerFeignApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }

}
