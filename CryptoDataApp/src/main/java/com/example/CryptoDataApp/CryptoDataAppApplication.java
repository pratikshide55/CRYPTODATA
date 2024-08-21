package com.example.CryptoDataApp;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CryptoDataAppApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(CryptoDataAppApplication.class)
                         .properties("server.PORT=8090");
    }

    public static void main(String[] args) {
        SpringApplication.run(CryptoDataAppApplication.class, args);
    }
}
