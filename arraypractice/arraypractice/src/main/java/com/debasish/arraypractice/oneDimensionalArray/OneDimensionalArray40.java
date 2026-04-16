package com.debasish.arraypractice.oneDimensionalArray;

import java.util.Arrays;

public class OneDimensionalArray40 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 41: CHECK DUPLICATE (OPTIMIZED)
        // ======================================

        // Step 1: create array
        int[] arr = {1, 2, 3, 1};

        // Step 2: sort array
        Arrays.sort(arr);

        boolean hasDuplicate = false;

        // Step 3: check adjacent elements
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] == arr[i + 1]) {
                hasDuplicate = true;
                break;
            }
        }

        // Step 4: print result
        if (hasDuplicate) {
            System.out.println("Array contains duplicate");
        } else {
            System.out.println("No duplicates found");
        }

    }
}