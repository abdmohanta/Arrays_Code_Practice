package com.debasish.arraypractice.oneDimensionalArray;

import java.util.Arrays;

public class OneDimensionalArray11 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 12: REMOVE DUPLICATES
        // ======================================

        // Step 1: create sorted array (important)
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        // Step 2: temp array to store unique values
        int[] temp = new int[arr.length];

        int j = 0;

        // Step 3: check duplicates
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] != arr[i + 1]) {
                temp[j] = arr[i];
                j++;
            }
        }

        // add last element
        temp[j] = arr[arr.length - 1];

        // Step 4: print unique elements
        System.out.print("Unique Elements: ");

        for (int i = 0; i <= j; i++) {
            System.out.print(temp[i] + " ");
        }

    }
}