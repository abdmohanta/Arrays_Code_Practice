package com.debasish.arraypractice.oneDimensionalArray;

public class OneDimensionalArray1 {

    public static void main(String[] args) {
        // PROBLEM 2: SUM OF ARRAY
        int[] arr = {10, 20, 30, 40, 50};
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        System.out.println("Sum of Array: " + sum);

    }
}
