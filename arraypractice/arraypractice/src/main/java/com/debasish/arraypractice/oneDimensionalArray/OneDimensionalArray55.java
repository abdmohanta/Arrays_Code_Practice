package com.debasish.arraypractice.oneDimensionalArray;
import java.util.Arrays;
public class OneDimensionalArray55 {
    public static void main(String[] args) {
        // PROBLEM 56: SLIDING WINDOW MAXIMUM
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        int n = arr.length;
        int[] result = new int[n - k + 1];
        for (int i = 0; i <= n - k; i++) {
            int max = arr[i];
            for (int j = i; j < i + k; j++) {
                if (arr[j] > max) {
                    max = arr[j];
                }
            }
            result[i] = max;
        }
        System.out.println("Sliding Window Max: " + Arrays.toString(result));
    }
}