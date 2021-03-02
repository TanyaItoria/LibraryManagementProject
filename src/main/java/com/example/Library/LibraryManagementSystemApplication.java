package com.example.Library;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LibraryManagementSystemApplication implements CommandLineRunner {
    @Autowired
    private LibraryStarter librarystarter;


    public static void main(String[] args) {
        SpringApplication.run(LibraryManagementSystemApplication.class, args);
    }

    @Override
    public void run(String... args) {         //When I write throws Exception here, it gave me error, why?
        librarystarter.start();
    }
}
