
package com.debasish.arraypractice.oneDimensionalArray;

public class OneDimensionalArray42 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 43: COUNT ALL SUBARRAYS
        // ======================================

        // Step 1: create array
        int[] arr = {1, 2, 3};

        int n = arr.length;

        // Step 2: count using formula
        int count = n * (n + 1) / 2;

        // Step 3: print result
        System.out.println("Total Subarrays: " + count);

    }
}