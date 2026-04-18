package com.debasish.arraypractice.oneDimensionalArray;

public class OneDimensionalArray44 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 45: LONGEST SUBARRAY WITH SUM K
        // ======================================

        // Step 1: create array
        int[] arr = {1, 2, 3, 1, 1, 1, 1};

        int k = 3;
        int n = arr.length;

        int maxLength = 0;

        // Step 2: check all subarrays
        for (int start = 0; start < n; start++) {

            int sum = 0;

            for (int end = start; end < n; end++) {

                sum = sum + arr[end];

                if (sum == k) {
                    int length = end - start + 1;

                    if (length > maxLength) {
                        maxLength = length;
                    }
                }
            }
        }

        // Step 3: print result
        System.out.println("Longest Length: " + maxLength);

    }
}