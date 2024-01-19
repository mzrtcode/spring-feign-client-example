package com.feigntest.feign.configuration;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignClientConfig {

    // Bean para hacer que Feign nos muestre logs
    @Bean
    Logger.Level feignLogger () {return Logger.Level.FULL;}
}
