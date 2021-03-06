package com.example;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Example {

	@RequestMapping(value = "/")
    String home() {
        return "Hello World Testing done...!";
    }

    public static void main(String[] args) throws Exception {
		System.out.println("hlooo");
        SpringApplication.run(Example.class, args);
    }

}