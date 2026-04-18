package com.debasish.arraypractice.oneDimensionalArray;

import java.util.Arrays;

public class OneDimensionalArray47 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 48: 3SUM (TRIPLETS = 0)
        // ======================================

        // Step 1: create array
        int[] arr = {-1, 0, 1, 2, -1, -4};

        int n = arr.length;

        // Step 2: sort array
        Arrays.sort(arr);

        System.out.println("Triplets:");

        // Step 3: fix one element
        for (int i = 0; i < n - 2; i++) {

            int left = i + 1;
            int right = n - 1;

            while (left < right) {

                int sum = arr[i] + arr[left] + arr[right];

                if (sum == 0) {
                    System.out.println(arr[i] + ", " + arr[left] + ", " + arr[right]);

                    left++;
                    right--;

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
        }

    }
}