package com.debasish.arraypractice.oneDimensionalArray;
import java.util.Arrays;
public class OneDimensionalArray26 {
    public static void main(String[] args) {
        // PROBLEM 27: PRODUCT OF ARRAY EXCEPT SELF
        int[] arr = {1, 2, 3, 4};
        int n = arr.length;
        int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            int product = 1;
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    product = product * arr[j];
                }
            }
            result[i] = product;
        }
        System.out.println("Result: " + Arrays.toString(result));
    }
}