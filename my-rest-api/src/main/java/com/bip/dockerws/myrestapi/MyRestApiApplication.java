package com.bip.dockerws.myrestapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyRestApiApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(MyRestApiApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("MyRestApiApplication started...");
    }
}
