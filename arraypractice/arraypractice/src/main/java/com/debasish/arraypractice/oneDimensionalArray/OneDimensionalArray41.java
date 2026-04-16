package com.debasish.arraypractice.oneDimensionalArray;

public class OneDimensionalArray41 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 42: PRINT ALL SUBARRAYS
        // ======================================

        // Step 1: create array
        int[] arr = {1, 2, 3};

        int n = arr.length;

        // Step 2: generate subarrays
        for (int start = 0; start < n; start++) {

            for (int end = start; end < n; end++) {

                // print subarray from start to end
                for (int i = start; i <= end; i++) {
                    System.out.print(arr[i] + " ");
                }

                System.out.println(); // new line
            }
        }

    }
}