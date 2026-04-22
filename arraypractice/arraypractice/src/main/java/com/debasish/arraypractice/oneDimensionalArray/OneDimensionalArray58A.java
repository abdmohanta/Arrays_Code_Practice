
package com.debasish.arraypractice.oneDimensionalArray;

public class OneDimensionalArray58A {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 59: MAX SUM NON-ADJACENT
        // ======================================

        // Step 1: create array
        int[] arr = {2, 1, 4, 9};

        int n = arr.length;

        // Step 2: handle edge case
        if (n == 0) {
            System.out.println("Max Sum: 0");
            return;
        }

        if (n == 1) {
            System.out.println("Max Sum: " + arr[0]);
            return;
        }

        // Step 3: initialize
        int prev2 = arr[0]; // dp[i-2]
        int prev1 = Math.max(arr[0], arr[1]); // dp[i-1]

        // Step 4: iterate
        for (int i = 2; i < n; i++) {

            int pick = arr[i] + prev2;   // include current
            int notPick = prev1;         // exclude current

            int current = Math.max(pick, notPick);

            // update
            prev2 = prev1;
            prev1 = current;
        }

        // Step 5: print result
        System.out.println("Maximum Sum: " + prev1);

    }
}