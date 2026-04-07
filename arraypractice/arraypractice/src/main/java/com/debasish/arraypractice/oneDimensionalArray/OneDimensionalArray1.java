package com.debasish.arraypractice.oneDimensionalArray;

public class OneDimensionalArray1 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 2: SUM OF ARRAY
        // ======================================

        // Step 1: create array
        int[] arr = {10, 20, 30, 40, 50};

        // Step 2: take sum variable
        int sum = 0;

        // Step 3: loop and add elements
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        // Step 4: print result
        System.out.println("Sum of Array: " + sum);

    }
}