package com.debasish.arraypractice.oneDimensionalArray;

public class OneDimensionalArray57 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 58: SUBARRAY SUM EQUALS K (COUNT)
        // ======================================

        // Step 1: create array
        int[] arr = {1, 1, 1};

        int k = 2;
        int n = arr.length;

        int count = 0;

        // Step 2: check all subarrays
        for (int start = 0; start < n; start++) {

            int sum = 0;

            for (int end = start; end < n; end++) {

                sum = sum + arr[end];

                if (sum == k) {
                    count++;
                }
            }
        }

        // Step 3: print result
        System.out.println("Total Subarrays: " + count);

    }
}