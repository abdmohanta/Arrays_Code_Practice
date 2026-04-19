package com.debasish.arraypractice.oneDimensionalArray;
import java.util.Arrays;
public class OneDimensionalArray51 {
    public static void main(String[] args) {
        // PROBLEM 52: NEXT GREATER ELEMENT
        int[] arr = {4, 5, 2, 10};
        int n = arr.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            result[i] = -1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > arr[i]) {
                    result[i] = arr[j];
                    break;
                }
            }
        }
        System.out.println("Next Greater Elements: " + Arrays.toString(result));
    }
}