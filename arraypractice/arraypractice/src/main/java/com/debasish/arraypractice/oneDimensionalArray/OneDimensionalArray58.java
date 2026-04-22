package com.debasish.arraypractice.oneDimensionalArray;
public class OneDimensionalArray58 {
    public static void main(String[] args) {
        // PROBLEM 59: MAX SUM NON-ADJACENT ELEMENTS
        int[] arr = {2, 1, 4, 9};
        int n = arr.length;
        if (n == 0) {
            System.out.println("Max Sum: 0");
            return;
        }
        if (n == 1) {
            System.out.println("Max Sum: " + arr[0]);
            return;
        }
        int prev2 = arr[0];
        int prev1 = Math.max(arr[0], arr[1]);
        for (int i = 2; i < n; i++) {
            int pick = arr[i] + prev2;
            int notPick = prev1;
            int current = Math.max(pick, notPick);
            prev2 = prev1;
            prev1 = current;
        }
        System.out.println("Maximum Sum: " + prev1);
    }
}
