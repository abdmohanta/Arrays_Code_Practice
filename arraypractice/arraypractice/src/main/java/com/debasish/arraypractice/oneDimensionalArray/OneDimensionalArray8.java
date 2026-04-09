package com.debasish.arraypractice.oneDimensionalArray;

public class OneDimensionalArray8 {
    public static void main(String[] args) {

        // ======================================
        // PROBLEM 9: COUNT EVEN & ODD
        // ======================================

        // Step 1: create array
        int[] arr = {10, 15, 20, 25, 30};

        // Step 2: counters
        int even = 0;
        int odd = 0;

        // Step 3: loop and check
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 == 0) {
                even++;   // even count
            } else {
                odd++;    // odd count
            }
        }

        // Step 4: print result
        System.out.println("Even Count: " + even);
        System.out.println("Odd Count: " + odd);

    }
}