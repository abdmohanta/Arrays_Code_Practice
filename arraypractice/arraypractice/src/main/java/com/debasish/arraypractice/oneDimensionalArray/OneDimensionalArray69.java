package com.debasish.arraypractice.oneDimensionalArray;
public class OneDimensionalArray69 {
    public static void main(String[] args) {
        // PROBLEM 70: FIRST MISSING POSITIVE (OPTIMIZED)
        int[] arr = {3, 4, -1, 1};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            while (arr[i] > 0 && arr[i] <= n && arr[arr[i] - 1] != arr[i]) {
                int temp = arr[i];
                arr[i] = arr[arr[i] - 1];
                arr[temp - 1] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] != i + 1) {
                System.out.println("First Missing Positive: " + (i + 1));
                return;
            }
        }
        System.out.println("First Missing Positive: " + (n + 1));
    }
}