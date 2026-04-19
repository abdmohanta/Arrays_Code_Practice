package com.debasish.arraypractice.oneDimensionalArray;

import java.util.Arrays;

public class OneDimensionalArray48 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 49: CLOSEST SUM PAIR
        // ======================================

        // Step 1: create array
        int[] arr = {1, 3, 4, 7, 10};

        int target = 15;
        int n = arr.length;

        // Step 2: sort array
        Arrays.sort(arr);

        int left = 0;
        int right = n - 1;

        int minDiff = Integer.MAX_VALUE;

        int num1 = 0;
        int num2 = 0;

        // Step 3: two pointer approach
        while (left < right) {

            int sum = arr[left] + arr[right];

            int diff = Math.abs(target - sum);

            // update closest pair
            if (diff < minDiff) {
                minDiff = diff;
                num1 = arr[left];
                num2 = arr[right];
            }

            // move pointers
            if (sum < target) {
                left++;
            } else {
                right--;
            }
        }

        // Step 4: print result
        System.out.println("Closest Pair: " + num1 + ", " + num2);
        System.out.println("Sum: " + (num1 + num2));

    }
}