package com.debasish.arraypractice.oneDimensionalArray;
import java.util.Arrays;
public class OneDimensionalArray29 {
    public static void main(String[] args) {
        // PROBLEM 30: ROTATE ARRAY BY K STEPS
        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;
        int n = arr.length;
        k = k % n;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
        System.out.println("Rotated Array: " + Arrays.toString(arr));
    }
}