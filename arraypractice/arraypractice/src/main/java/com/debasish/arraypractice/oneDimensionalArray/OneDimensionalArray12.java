package com.debasish.arraypractice.oneDimensionalArray;

public class OneDimensionalArray12 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 13: FREQUENCY OF ELEMENTS
        // ======================================

        // Step 1: create array
        int[] arr = {1, 2, 2, 3, 1, 4, 2};

        // Step 2: visited array to track counted elements
        boolean[] visited = new boolean[arr.length];

        // Step 3: loop through array
        for (int i = 0; i < arr.length; i++) {

            if (visited[i] == true) {
                continue; // skip already counted
            }

            int count = 1;

            // check same elements ahead
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] == arr[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            // Step 4: print result
            System.out.println(arr[i] + " occurs " + count + " times");
        }

    }
}
