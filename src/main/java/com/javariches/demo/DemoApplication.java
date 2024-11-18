package com.javariches.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.client.RestTemplate;

import java.net.URI;

@RestControllerAdvice
@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {

        SpringApplication.run(DemoApplication.class, args);
//        RestTemplate restTemplate = new RestTemplate();
//
//        String body = """
//            {
//                "firstName": "Gifford",
//                "lastName": "Leroy",
//                "email": "test@gmail.com",
//                "address": "123 fake City, FState 32229"
//            }
//        """;
//        RequestEntity<String> request = RequestEntity
//                .post(URI.create("http://localhost:8080/api/v1/signup"))
//                .contentType(MediaType.APPLICATION_JSON)
//                .body(body);
//        ResponseEntity<String> response = restTemplate.exchange(request, String.class);
//        System.out.println(response.getStatusCode());

    }

}
