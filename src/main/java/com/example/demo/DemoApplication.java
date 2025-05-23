package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class DemoApplication {
    public static void main(String[] args) {
    SpringApplication.run(DemoApplication.class, args);
}
@GetMapping("/")
    public String rootEndpoint(){
    String message = "Hello, world!";
    return message;
}

@GetMapping("/{name}")
public String greet(@PathVariable String name){
return "Hello,"+ name +"!";
}
}

