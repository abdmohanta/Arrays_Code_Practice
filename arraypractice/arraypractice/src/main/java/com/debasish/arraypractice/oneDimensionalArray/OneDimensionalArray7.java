package com.debasish.arraypractice.oneDimensionalArray;

public class OneDimensionalArray7 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 8: SECOND LARGEST ELEMENT
        // ======================================

        // Step 1: create array
        int[] arr = {10, 20, 30, 40, 50};

        // Step 2: take two variables
        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        // Step 3: loop through array
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > first) {
                second = first;     // old max becomes second
                first = arr[i];     // update max
            }
            else if (arr[i] > second && arr[i] != first) {
                second = arr[i];    // update second max
            }
        }

        // Step 4: print result
        System.out.println("Second Largest: " + second);

    }
}