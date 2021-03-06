package com.github.brandonstack.sc.gateway;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringCloudApplication
@EnableZuulProxy
public class ApiGatewayApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(ApiGatewayApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
