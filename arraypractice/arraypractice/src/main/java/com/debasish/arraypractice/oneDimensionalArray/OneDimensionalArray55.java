package com.debasish.arraypractice.oneDimensionalArray;

import java.util.Arrays;

public class OneDimensionalArray55 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 56: SLIDING WINDOW MAXIMUM
        // ======================================

        // Step 1: create array
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};

        int k = 3;
        int n = arr.length;

        int[] result = new int[n - k + 1];

        // Step 2: process each window
        for (int i = 0; i <= n - k; i++) {

            int max = arr[i];

            for (int j = i; j < i + k; j++) {

                if (arr[j] > max) {
                    max = arr[j];
                }
            }

            result[i] = max;
        }

        // Step 3: print result
        System.out.println("Sliding Window Max: " + Arrays.toString(result));

    }
}