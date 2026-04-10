package com.debasish.arraypractice.oneDimensionalArray;
import java.util.Arrays;

public class OneDimensionalArray16 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 17: MOVE ZEROS TO END
        // ======================================

        // Step 1: create array
        int[] arr = {0, 1, 0, 3, 12};

        // Step 2: position for non-zero elements
        int j = 0;

        // Step 3: move non-zero elements forward
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        // Step 4: fill remaining positions with 0
        while (j < arr.length) {
            arr[j] = 0;
            j++;
        }

        // Step 5: print result
        System.out.println("After Moving Zeros: " + Arrays.toString(arr));

    }
}