package com.debasish.arraypractice.oneDimensionalArray;

public class OneDimensionalArray71 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 72: MAX CONSECUTIVE ONES (1 FLIP)
        // ======================================

        // Step 1: create array
        int[] arr = {1, 0, 1, 1, 0};

        int left = 0;
        int zeroCount = 0;
        int maxLength = 0;

        // Step 2: sliding window
        for (int right = 0; right < arr.length; right++) {

            if (arr[right] == 0) {
                zeroCount++;
            }

            // allow only one zero
            while (zeroCount > 1) {

                if (arr[left] == 0) {
                    zeroCount--;
                }

                left++;
            }

            int length = right - left + 1;

            if (length > maxLength) {
                maxLength = length;
            }
        }

        // Step 3: print result
        System.out.println("Max Consecutive Ones (with 1 flip): " + maxLength);

    }
}