package com.debasish.arraypractice.oneDimensionalArray;

public class OneDimensionalArray65 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 66: FIND MISSING RANGES
        // ======================================

        // Step 1: create array
        int[] arr = {1, 3, 5};

        int low = 1;
        int high = 7;

        int prev = low - 1;

        System.out.println("Missing Ranges:");

        // Step 2: iterate through array
        for (int i = 0; i <= arr.length; i++) {

            int curr;

            if (i == arr.length) {
                curr = high + 1;
            } else {
                curr = arr[i];
            }

            if (curr - prev >= 2) {

                int start = prev + 1;
                int end = curr - 1;

                if (start == end) {
                    System.out.println(start);
                } else {
                    System.out.println(start + " to " + end);
                }
            }

            prev = curr;
        }

    }
}