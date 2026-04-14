package com.debasish.arraypractice.oneDimensionalArray;
public class OneDimensionalArray32 {
    public static void main(String[] args) {
        // PROBLEM 33: FIND PEAK ELEMENT
        int[] arr = {1, 3, 20, 4, 1};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if ((i == 0 || arr[i] > arr[i - 1]) &&
                    (i == n - 1 || arr[i] > arr[i + 1])) {
                System.out.println("Peak Element: " + arr[i]);
                break;
            }
        }
    }
}