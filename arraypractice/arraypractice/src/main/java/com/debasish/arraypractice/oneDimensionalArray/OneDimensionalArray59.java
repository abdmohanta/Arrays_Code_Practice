package com.debasish.arraypractice.oneDimensionalArray;
public class OneDimensionalArray59 {
    public static void main(String[] args) {
        // PROBLEM 60: LONGEST INCREASING SUBSEQUENCE (BRUTE)
        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
        int n = arr.length;
        int maxLength = 1;
        for (int i = 0; i < n; i++) {
            int count = 1;
            int last = arr[i];
            for (int j = i + 1; j < n; j++) {
                if (arr[j] > last) {
                    count++;
                    last = arr[j];
                }
            }
            if (count > maxLength) {
                maxLength = count;
            }
        }
        System.out.println("LIS Length: " + maxLength);
    }
}