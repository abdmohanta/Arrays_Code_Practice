package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArrayExampleApplication {

    public static void main(String[] args) {

        SpringApplication.run(ArrayExampleApplication.class, args);

        // Step 1: Declare and initialize array
        int[] arr = {10, 20, 30, 40, 50};

        // Step 2: Loop through array
        for (int i = 0; i < arr.length; i++) {

            // Step 3: Print each element
            System.out.println("Element at index " + i + " = " + arr[i]);
        }
    }
}