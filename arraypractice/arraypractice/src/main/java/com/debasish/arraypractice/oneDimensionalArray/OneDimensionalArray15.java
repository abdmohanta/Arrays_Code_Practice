package com.debasish.arraypractice.oneDimensionalArray;

public class OneDimensionalArray15 {
    public static void main(String[] args) {
        // ======================================
        // PROBLEM 16: CHECK ARRAY SORTED OR NOT
        // ======================================

        int[] arr = {10, 20, 30, 40, 50};
        boolean isSorted = true;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;
            }
        }
        if (isSorted) {
            System.out.println("Array is Sorted");
        } else {
            System.out.println("Array is NOT Sorted");
        }
    }
}