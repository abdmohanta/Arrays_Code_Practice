package com.debasish.arraypractice.oneDimensionalArray;

public class OneDimensionalArray69 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 70: FIRST MISSING POSITIVE (OPTIMIZED)
        // ======================================

        // Step 1: create array
        int[] arr = {3, 4, -1, 1};

        int n = arr.length;

        // Step 2: place elements at correct index
        for (int i = 0; i < n; i++) {

            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {

                // swap arr[i] with correct position
                int temp = arr[i];
                arr[i] = arr[arr[i] - 1];
                arr[temp - 1] = temp;
            }
        }

        // Step 3: find missing positive
        for (int i = 0; i < n; i++) {

            if (arr[i] != i + 1) {
                System.out.println("First Missing Positive: " + (i + 1));
                return;
            }
        }

        // Step 4: if all positions correct
        System.out.println("First Missing Positive: " + (n + 1));

    }
}