package com.wfs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

// @ComponentScan({"Dao","com.wfs"})
@SpringBootApplication
public class SpringbootParamApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootParamApplication.class, args);
    }

}
