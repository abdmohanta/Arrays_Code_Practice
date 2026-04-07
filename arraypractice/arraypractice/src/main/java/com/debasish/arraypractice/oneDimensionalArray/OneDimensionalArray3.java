package com.debasish.arraypractice.oneDimensionalArray;

public class OneDimensionalArray3 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 5: SEARCH ELEMENT
        // ======================================

        // Step 1: create array
        int[] arr = {10, 20, 30, 40, 50};

        // Step 2: element to search
        int key = 30;

        // Step 3: flag variable
        boolean found = false;

        // Step 4: loop and search
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == key) {
                found = true;
                break; // stop when found
            }
        }

        // Step 5: print result
        if (found) {
            System.out.println("Element found");
        } else {
            System.out.println("Element not found");
        }

    }
}