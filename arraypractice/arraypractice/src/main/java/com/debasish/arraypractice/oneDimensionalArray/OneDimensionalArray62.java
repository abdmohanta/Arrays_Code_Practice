package com.debasish.arraypractice.oneDimensionalArray;

import java.util.Arrays;

public class OneDimensionalArray62 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 63: K-th LARGEST ELEMENT
        // ======================================

        // Step 1: create array
        int[] arr = {3, 2, 1, 5, 6, 4};

        int k = 2;
        int n = arr.length;

        // Step 2: sort array
        Arrays.sort(arr);

        // Step 3: find k-th largest
        int result = arr[n - k];

        // Step 4: print result
        System.out.println("K-th Largest Element: " + result);

    }
}