package com.debasish.arraypractice.oneDimensionalArray;

public class OneDimensionalArray67 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 68: FIND ALL DUPLICATES (1 to n)
        // ======================================

        // Step 1: create array
        int[] arr = {4, 3, 2, 7, 8, 2, 3, 1};

        System.out.println("Duplicate Elements:");

        // Step 2: mark visited using negative sign
        for (int i = 0; i < arr.length; i++) {

            int index = Math.abs(arr[i]) - 1;

            if (arr[index] < 0) {
                System.out.println(index + 1);
            } else {
                arr[index] = -arr[index];
            }
        }

    }
}