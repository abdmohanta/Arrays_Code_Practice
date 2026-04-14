package com.debasish.arraypractice.oneDimensionalArray;
public class OneDimensionalArray34 {
    public static void main(String[] args) {
        // PROBLEM 35: SEARCH IN ROTATED ARRAY
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        int target = 0;
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Element found at index: " + index);
        } else {
            System.out.println("Element not found");
        }
    }
}
