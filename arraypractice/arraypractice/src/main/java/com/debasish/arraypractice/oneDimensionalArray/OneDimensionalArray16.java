package com.debasish.arraypractice.oneDimensionalArray;
import java.util.Arrays;

public class OneDimensionalArray16 {
    public static void main(String[] args) {

        // ======================================
        // PROBLEM 17: MOVE ZEROS TO END
        // ======================================
        int[] arr = {0, 1, 0, 3, 12};
        int j = 0;
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        while (j < arr.length) {
            arr[j] = 0;
            j++;
        }

        System.out.println("After Moving Zeros: " + Arrays.toString(arr));

    }
}