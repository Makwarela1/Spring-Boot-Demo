package org.example.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@SpringBootApplication
@RestController
public class SpringBootDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootDemoApplication.class, args);
    }

//    @GetMapping
//    public String welcome (){
//        return "Welcome to Spring Boot";
//    }
//
//    @PostMapping
//    public String goobye() {
//        return "Goodbye devs";
//    }

        @PostMapping
    public double answer (@RequestParam double a , @RequestParam double b){
        return a + b;
    }

//    @GetMapping
//    public double answer (@RequestParam double a , @RequestParam double b){
//
//        if ( a < 0 && b < 0){
//            System.out.println("Numbers must be greater than zero");
//        } else {
//            ResponseEntity.ok(a+b);
//        }
//    }
//


}
