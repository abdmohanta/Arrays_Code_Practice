package com.debasish.arraypractice.oneDimensionalArray;

import java.util.Arrays;

public class OneDimensionalArray14 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 15: RIGHT ROTATE ARRAY
        // ======================================

        // Step 1: create array
        int[] arr = {1, 2, 3, 4, 5};

        // Step 2: store last element
        int last = arr[arr.length - 1];

        // Step 3: shift elements to right
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        // Step 4: put last element at first
        arr[0] = last;

        // Step 5: print result
        System.out.println("After Right Rotation: " + Arrays.toString(arr));

    }
}
