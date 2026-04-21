package com.debasish.arraypractice.oneDimensionalArray;

import java.util.Arrays;

public class OneDimensionalArray53 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 54: NEXT SMALLER ELEMENT
        // ======================================

        // Step 1: create array
        int[] arr = {4, 8, 5, 2, 25};

        int n = arr.length;

        int[] result = new int[n];

        // Step 2: find next smaller
        for (int i = 0; i < n; i++) {

            result[i] = -1; // default

            for (int j = i + 1; j < n; j++) {

                if (arr[j] < arr[i]) {
                    result[i] = arr[j];
                    break;
                }
            }
        }

        // Step 3: print result
        System.out.println("Next Smaller Elements: " + Arrays.toString(result));

    }
}