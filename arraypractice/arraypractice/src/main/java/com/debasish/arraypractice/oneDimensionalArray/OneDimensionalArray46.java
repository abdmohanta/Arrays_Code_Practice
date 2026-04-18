package com.debasish.arraypractice.oneDimensionalArray;

import java.util.Arrays;

public class OneDimensionalArray46 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 47: SORT 0s, 1s, 2s
        // ======================================

        // Step 1: create array
        int[] arr = {2, 0, 2, 1, 1, 0};

        int low = 0;
        int mid = 0;
        int high = arr.length - 1;

        // Step 2: Dutch National Flag logic
        while (mid <= high) {

            if (arr[mid] == 0) {

                // swap arr[low] and arr[mid]
                int temp = arr[low];
                arr[low] = arr[mid];
                arr[mid] = temp;

                low++;
                mid++;

            } else if (arr[mid] == 1) {

                mid++;

            } else { // arr[mid] == 2

                // swap arr[mid] and arr[high]
                int temp = arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;

                high--;
            }
        }

        // Step 3: print result
        System.out.println("Sorted Array: " + Arrays.toString(arr));

    }
}
