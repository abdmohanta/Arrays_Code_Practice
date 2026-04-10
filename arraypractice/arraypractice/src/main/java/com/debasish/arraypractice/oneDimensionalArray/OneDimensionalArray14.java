package com.debasish.arraypractice.oneDimensionalArray;
import java.util.Arrays;
public class OneDimensionalArray14 {
    public static void main(String[] args) {
        // PROBLEM 15: RIGHT ROTATE ARRAY
        int[] arr = {1, 2, 3, 4, 5};
        int last = arr[arr.length - 1];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;
        System.out.println("After Right Rotation: " + Arrays.toString(arr));

    }
}
