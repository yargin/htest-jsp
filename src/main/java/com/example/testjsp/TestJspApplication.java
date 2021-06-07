package com.example.testjsp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class TestJspApplication {
//    com.example.testjsp.TestJspApplication

    public TestJspApplication(Environment environment) {
        System.out.println(environment.getProperty("========================================================================="));
        System.out.println(environment.getProperty("PORT"));
        System.out.println(environment.getProperty("========================================================================="));
    }
    public static void main(String[] args) {
        SpringApplication.run(TestJspApplication.class, args);
    }

}
