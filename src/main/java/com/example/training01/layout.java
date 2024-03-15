package com.example.training01;

import nz.net.ultraq.thymeleaf.LayoutDialect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class layout {

    @Bean
    public LayoutDialect layoutDialect() {
        return new LayoutDialect();
    }
}
