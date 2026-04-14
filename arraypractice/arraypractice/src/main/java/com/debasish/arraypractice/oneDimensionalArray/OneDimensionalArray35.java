package com.debasish.arraypractice.oneDimensionalArray;
public class OneDimensionalArray35 {
    public static void main(String[] args) {
        // PROBLEM 36: FIRST REPEATING ELEMENT
        int[] arr = {10, 5, 3, 4, 3, 5, 6};
        int n = arr.length;
        int firstRepeating = -1;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    firstRepeating = arr[i];
                    break;
                }
            }
            if (firstRepeating != -1) {
                break;
            }
        }
        if (firstRepeating != -1) {
            System.out.println("First Repeating Element: " + firstRepeating);
        } else {
            System.out.println("No Repeating Element");
        }
    }
}