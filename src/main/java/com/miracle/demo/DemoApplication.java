package com.miracle.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//标注这个类是springboot的应用
@SpringBootApplication
public class DemoApplication {
    //启动springboot
    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
