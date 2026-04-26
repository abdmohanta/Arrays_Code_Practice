package com.debasish.arraypractice.oneDimensionalArray;

public class OneDimensionalArray66 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 67: FIND DUPLICATE (FLOYD CYCLE)
        // ======================================

        // Step 1: create array
        int[] arr = {1, 3, 4, 2, 2};

        // Step 2: initialize slow & fast
        int slow = arr[0];
        int fast = arr[0];

        // Step 3: detect cycle
        do {
            slow = arr[slow];
            fast = arr[arr[fast]];
        } while (slow != fast);

        // Step 4: find entry point (duplicate)
        slow = arr[0];

        while (slow != fast) {
            slow = arr[slow];
            fast = arr[fast];
        }

        // Step 5: print result
        System.out.println("Duplicate Number: " + slow);

    }
}