package com.debasish.arraypractice.oneDimensionalArray;
import java.util.Arrays;
public class OneDimensionalArray36 {
    public static void main(String[] args) {
        // PROBLEM 37: SMALLEST MISSING POSITIVE
        int[] arr = {3, 4, -1, 1};
        int n = arr.length;
        Arrays.sort(arr);
        int missing = 1;
        for (int i = 0; i < n; i++) {
            if (arr[i] == missing) {
                missing++;
            }
        }
        System.out.println("Smallest Missing Positive: " + missing);
    }
}