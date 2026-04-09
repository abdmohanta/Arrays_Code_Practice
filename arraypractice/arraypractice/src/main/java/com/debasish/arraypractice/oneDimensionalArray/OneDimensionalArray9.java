package com.debasish.arraypractice.oneDimensionalArray;

import java.util.Arrays;

public class OneDimensionalArray9 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 10: COPY ARRAY
        // ======================================

        // Step 1: create original array
        int[] arr = {10, 20, 30, 40, 50};

        // Step 2: create new array of same size
        int[] copy = new int[arr.length];

        // Step 3: copy elements manually
        for (int i = 0; i < arr.length; i++) {
            copy[i] = arr[i];
        }

        // Step 4: print copied array
        System.out.println("Copied Array: " + Arrays.toString(copy));

    }
}
