package com.debasish.arraypractice.oneDimensionalArray;
public class OneDimensionalArray37 {
    public static void main(String[] args) {
        // PROBLEM 38: SUBARRAY WITH GIVEN SUM
        int[] arr = {1, 2, 3, 7, 5};
        int target = 12;
        int n = arr.length;
        int start = 0;
        int currentSum = 0;
        for (int end = 0; end < n; end++) {
            currentSum = currentSum + arr[end];
            while (currentSum > target && start <= end) {
                currentSum = currentSum - arr[start];
                start++;
            }
            if (currentSum == target) {
                System.out.println("Subarray found from index " + start + " to " + end);
                break;
            }
        }
    }
}