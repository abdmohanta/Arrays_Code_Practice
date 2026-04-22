package com.debasish.arraypractice.oneDimensionalArray;
public class OneDimensionalArray57 {
    public static void main(String[] args) {
        // PROBLEM 58: SUBARRAY SUM EQUALS K (COUNT)
        int[] arr = {1, 1, 1};
        int k = 2;
        int n = arr.length;
        int count = 0;
        for (int start = 0; start < n; start++) {
            int sum = 0;
            for (int end = start; end < n; end++) {
                sum = sum + arr[end];
                if (sum == k) {
                    count++;
                }
            }
        }
        System.out.println("Total Subarrays: " + count);
    }
}