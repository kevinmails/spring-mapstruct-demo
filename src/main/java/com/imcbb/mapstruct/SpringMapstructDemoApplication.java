package com.imcbb.mapstruct;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@Slf4j
@SpringBootApplication
public class SpringMapstructDemoApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringMapstructDemoApplication.class, args);
        System.out.println("abc");
        log.info("start....");
    }


}


