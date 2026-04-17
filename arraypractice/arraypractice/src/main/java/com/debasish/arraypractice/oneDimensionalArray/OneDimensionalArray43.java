package com.debasish.arraypractice.oneDimensionalArray;
public class OneDimensionalArray43 {
    public static void main(String[] args) {
        // PROBLEM 44: MAX SUBARRAY SUM (BRUTE)
        int[] arr = {1, -2, 3, 4};
        int n = arr.length;
        int maxSum = Integer.MIN_VALUE;
        for (int start = 0; start < n; start++) {
            int currentSum = 0;
            for (int end = start; end < n; end++) {
                currentSum = currentSum + arr[end];
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                }
            }
        }
        System.out.println("Maximum Subarray Sum: " + maxSum);
    }
}