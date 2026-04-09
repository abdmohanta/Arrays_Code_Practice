package com.debasish.arraypractice.oneDimensionalArray;

import java.util.Arrays;

public class OneDimensionalArray10 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 11: MERGE TWO ARRAYS
        // ======================================

        // Step 1: create two arrays
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};

        // Step 2: create new array
        int[] merge = new int[a.length + b.length];

        // Step 3: copy first array
        for (int i = 0; i < a.length; i++) {
            merge[i] = a[i];
        }

        // Step 4: copy second array
        for (int i = 0; i < b.length; i++) {
            merge[a.length + i] = b[i];
        }

        // Step 5: print merged array
        System.out.println("Merged Array: " + Arrays.toString(merge));

    }
}