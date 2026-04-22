package com.debasish.arraypractice.oneDimensionalArray;

public class OneDimensionalArray59 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 60: LONGEST INCREASING SUBSEQUENCE (BRUTE)
        // ======================================

        // Step 1: create array
        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};

        int n = arr.length;

        int maxLength = 1;

        // Step 2: check all subsequences (simple increasing check)
        for (int i = 0; i < n; i++) {

            int count = 1;
            int last = arr[i];

            for (int j = i + 1; j < n; j++) {

                if (arr[j] > last) {
                    count++;
                    last = arr[j];
                }
            }

            if (count > maxLength) {
                maxLength = count;
            }
        }

        // Step 3: print result
        System.out.println("LIS Length: " + maxLength);

    }
}