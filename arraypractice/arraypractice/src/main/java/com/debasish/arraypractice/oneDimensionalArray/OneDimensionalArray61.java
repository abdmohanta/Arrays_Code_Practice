package com.debasish.arraypractice.oneDimensionalArray;
public class OneDimensionalArray61 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 62: LIS (BINARY SEARCH)
        // ======================================

        // Step 1: create array
        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};

        int n = arr.length;

        int[] tail = new int[n];
        int size = 0;

        // Step 2: process elements
        for (int i = 0; i < n; i++) {

            int num = arr[i];

            // binary search
            int left = 0, right = size;

            while (left < right) {
                int mid = (left + right) / 2;

                if (tail[mid] < num) {
                    left = mid + 1;
                } else {
                    right = mid;
                }
            }

            tail[left] = num;

            if (left == size) {
                size++;
            }
        }

        // Step 3: print result
        System.out.println("LIS Length (Optimized): " + size);

    }
}