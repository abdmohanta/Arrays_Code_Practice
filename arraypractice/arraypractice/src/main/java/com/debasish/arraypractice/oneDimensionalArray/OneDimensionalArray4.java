package com.debasish.arraypractice;

public class OneDimensionalArray4 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 4: FIND MIN ELEMENT
        // ======================================

        // Step 1: create array
        int[] arr = {10, 25, 5, 40, 15};

        // Step 2: assume first element is min
        int min = arr[0];

        // Step 3: compare with other elements
        for (int i = 1; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i]; // update min
            }
        }

        // Step 4: print result
        System.out.println("Minimum Element: " + min);

    }
}