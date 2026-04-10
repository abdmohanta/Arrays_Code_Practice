package com.debasish.arraypractice.oneDimensionalArray;

import java.util.Arrays;
public class OneDimensionalArray13 {
    public static void main(String[] args) {
        // PROBLEM 14: LEFT ROTATE ARRAY
        int[] arr = {1, 2, 3, 4, 5};
        int first = arr[0];
        for (int i = 0; i < arr.length - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[arr.length - 1] = first;
        System.out.println("After Left Rotation: " + Arrays.toString(arr));
    }
}
