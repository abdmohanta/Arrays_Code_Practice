package com.debasish.arraypractice.oneDimensionalArray;

public class OneDimensionalArray39 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 40: MIN SIZE SUBARRAY SUM
        // ======================================

        // Step 1: create array
        int[] arr = {2, 3, 1, 2, 4, 3};

        int target = 7;
        int n = arr.length;

        int start = 0;
        int currentSum = 0;
        int minLength = Integer.MAX_VALUE;

        // Step 2: sliding window
        for (int end = 0; end < n; end++) {

            currentSum = currentSum + arr[end];

            // shrink window when sum >= target
            while (currentSum >= target) {

                int length = end - start + 1;

                if (length < minLength) {
                    minLength = length;
                }

                currentSum = currentSum - arr[start];
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