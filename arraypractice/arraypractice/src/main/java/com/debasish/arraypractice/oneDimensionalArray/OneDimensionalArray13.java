package com.debasish.arraypractice.oneDimensionalArray;

import java.util.Arrays;

public class OneDimensionalArray13 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 14: LEFT ROTATE ARRAY
        // ======================================

        // Step 1: create array
        int[] arr = {1, 2, 3, 4, 5};

        // Step 2: store first element
        int first = arr[0];

        // Step 3: shift elements to left
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }

        // Step 4: put first element at last
        arr[arr.length - 1] = first;

        // Step 5: print result
        System.out.println("After Left Rotation: " + Arrays.toString(arr));

    }
}
