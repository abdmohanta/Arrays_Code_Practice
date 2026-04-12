package com.debasish.arraypractice.oneDimensionalArray;

public class OneDimensionalArray21 {

    public static void main(String[] args) {
        // PROBLEM 22: PAIR WITH GIVEN SUM
        int[] arr = {2, 7, 11, 15};
        int target = 9;
        System.out.println("Pairs with given sum:");
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] + arr[j] == target) {
                    System.out.println(arr[i] + " + " + arr[j] + " = " + target);
                }
            }
        }

    }
}