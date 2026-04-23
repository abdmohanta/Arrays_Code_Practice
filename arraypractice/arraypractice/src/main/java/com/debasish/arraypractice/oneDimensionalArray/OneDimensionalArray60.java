package com.debasish.arraypractice.oneDimensionalArray;
import java.util.Arrays;
public class OneDimensionalArray60 {
    public static void main(String[] args) {
        // PROBLEM 61: LIS (DP APPROACH)
        int[] arr = {10, 9, 2, 5, 3, 7, 101, 18};
        int n = arr.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        int maxLength = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            if (dp[i] > maxLength) {
                maxLength = dp[i];
            }
        }
        System.out.println("LIS Length (DP): " + maxLength);
    }
}