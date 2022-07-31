package ru.makovets;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        System.out.println("Application started.\n" +
                "http://arch.homework/health - healthcheck uri");
        SpringApplication.run(App.class, args);
    }
}