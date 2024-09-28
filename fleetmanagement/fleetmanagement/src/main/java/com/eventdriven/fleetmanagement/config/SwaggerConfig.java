package com.eventdriven.fleetmanagement.config;

import org.springdoc.core.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

    @Bean
    public GroupedOpenApi vehicleApi() {
        return GroupedOpenApi.builder()
                .group("vehicle-events")
                .pathsToMatch("/vehicle/**")
                .build();
    }
}