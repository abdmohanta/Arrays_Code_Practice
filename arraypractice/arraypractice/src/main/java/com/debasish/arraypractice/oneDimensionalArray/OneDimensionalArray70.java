package com.debasish.arraypractice.oneDimensionalArray;

public class OneDimensionalArray70 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 71: MAXIMUM CONSECUTIVE ONES
        // ======================================

        // Step 1: create array
        int[] arr = {1, 1, 0, 1, 1, 1};

        int maxCount = 0;
        int currentCount = 0;

        // Step 2: traverse array
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {
                currentCount++; // increase count
            } else {
                currentCount = 0; // reset when 0 comes
            }

            // update max
            if (currentCount > maxCount) {
                maxCount = currentCount;
            }
        }

        // Step 3: print result
        System.out.println("Maximum Consecutive Ones: " + maxCount);

    }
}