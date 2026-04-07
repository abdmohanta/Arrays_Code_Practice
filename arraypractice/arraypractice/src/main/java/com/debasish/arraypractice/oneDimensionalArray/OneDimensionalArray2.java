package com.debasish.arraypractice;

public class OneDimensionalArray2 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 3: FIND MAX ELEMENT
        // ======================================

        // Step 1: create array
        int[] arr = {10, 25, 5, 40, 15};

        // Step 2: assume first element is max
        int max = arr[0];

        // Step 3: compare with other elements
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i]; // update max
            }
        }

        // Step 4: print result
        System.out.println("Maximum Element: " + max);

    }
}