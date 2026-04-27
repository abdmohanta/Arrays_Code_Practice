package com.debasish.arraypractice.oneDimensionalArray;

public class OneDimensionalArray68 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 69: FIND ALL MISSING NUMBERS
        // ======================================

        // Step 1: create array
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};

        int n = arr.length;

        // Step 2: mark visited using negative sign
        for (int i = 0; i < n; i++) {

            int index = Math.abs(arr[i]) - 1;

            if (arr[index] > 0) {
                arr[index] = -arr[index];
            }
        }

        // Step 3: find missing numbers
        System.out.println("Missing Numbers:");

        for (int i = 0; i < n; i++) {

            if (arr[i] > 0) {
                System.out.println(i + 1);
            }
        }

    }
}