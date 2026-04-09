package com.debasish.arraypractice.oneDimensionalArray;

public class OneDimensionalArray15 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 16: CHECK ARRAY SORTED OR NOT
        // ======================================

        // Step 1: create array
        int[] arr = {10, 20, 30, 40, 50};

        // Step 2: assume sorted
        boolean isSorted = true;

        // Step 3: check order
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }

        // Step 4: print result
        if (isSorted) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is NOT Sorted");
        }

    }
}