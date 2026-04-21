package com.debasish.arraypractice.oneDimensionalArray;

public class OneDimensionalArray56 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 57: MIN WINDOW SUM >= K (OPTIMIZED)
        // ======================================

        // Step 1: create array
        int[] arr = {2, 3, 1, 2, 4, 3};

        int k = 7;
        int n = arr.length;

        int start = 0;
        int sum = 0;
        int minLength = Integer.MAX_VALUE;

        // Step 2: sliding window
        for (int end = 0; end < n; end++) {

            sum = sum + arr[end];

            // shrink window
            while (sum >= k) {

                int length = end - start + 1;

                if (length < minLength) {
                    minLength = length;
                }

                sum = sum - arr[start];
                start++;
            }
        }

        // Step 3: print result
        if (minLength == Integer.MAX_VALUE) {
            System.out.println("No such subarray");
        } else {
            System.out.println("Minimum Length: " + minLength);
        }

    }
}