package com.debasish.arraypractice.oneDimensionalArray;

import java.util.Arrays;

public class OneDimensionalArray5 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 6: REVERSE ARRAY
        // ======================================

        // Step 1: create array
        int[] arr = {1, 2, 3, 4, 5};

        // Step 2: reverse using swapping
        for (int i = 0; i < arr.length / 2; i++) {

            int temp = arr[i]; // store first
            arr[i] = arr[arr.length - 1 - i]; // swap with last
            arr[arr.length - 1 - i] = temp;
        }

        // Step 3: print reversed array
        System.out.println("Reversed Array: " + Arrays.toString(arr));

    }
}