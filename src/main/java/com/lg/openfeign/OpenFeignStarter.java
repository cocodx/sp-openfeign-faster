package com.lg.openfeign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author 正能量导师
 * @date 2022/6/16-9:31
 * @Description
 */
@EnableFeignClients
@SpringBootApplication
public class OpenFeignStarter {

    public static void main(String[] args) {
        SpringApplication.run(OpenFeignStarter.class,args);
    }
}
