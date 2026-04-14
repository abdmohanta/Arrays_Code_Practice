package com.debasish.arraypractice.oneDimensionalArray;
public class OneDimensionalArray33 {
    public static void main(String[] args) {
        // PROBLEM 34: MIN IN ROTATED SORTED ARRAY
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Minimum Element: " + min);
    }
}