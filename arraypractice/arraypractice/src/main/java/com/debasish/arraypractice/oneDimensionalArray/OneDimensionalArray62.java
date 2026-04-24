package com.debasish.arraypractice.oneDimensionalArray;
import java.util.Arrays;

public class OneDimensionalArray62 {
    public static void main(String[] args) {
        // PROBLEM 63: K-th LARGEST ELEMENT
        int[] arr = {3, 2, 1, 5, 6, 4};
        int k = 2;
        int n = arr.length;
        Arrays.sort(arr);
        int result = arr[n - k];
        System.out.println("K-th Largest Element: " + result);

    }
}