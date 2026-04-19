package com.debasish.arraypractice.oneDimensionalArray;

import java.util.Arrays;

public class OneDimensionalArray51 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 52: NEXT GREATER ELEMENT
        // ======================================

        // Step 1: create array
        int[] arr = {4, 5, 2, 10};

        int n = arr.length;

        // Step 2: result array
        int[] result = new int[n];

        // Step 3: find next greater
        for (int i = 0; i < n; i++) {

            result[i] = -1; // default

            for (int j = i + 1; j < n; j++) {

                if (arr[j] > arr[i]) {
                    result[i] = arr[j];
                    break;
                }
            }
        }

        // Step 4: print result
        System.out.println("Next Greater Elements: " + Arrays.toString(result));

    }
}