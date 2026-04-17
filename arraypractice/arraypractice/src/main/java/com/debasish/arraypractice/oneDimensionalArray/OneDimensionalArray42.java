package com.debasish.arraypractice.oneDimensionalArray;
public class OneDimensionalArray42 {
    public static void main(String[] args) {
        // PROBLEM 43: COUNT ALL SUBARRAYS
        int[] arr = {1, 2, 3};
        int n = arr.length;
        int count = n * (n + 1) / 2;
        System.out.println("Total Subarrays: " + count);
    }
}