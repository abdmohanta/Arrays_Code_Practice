package com.debasish.arraypractice.oneDimensionalArray;
public class OneDimensionalArray22 {
    public static void main(String[] args) {
        // PROBLEM 23: MAJORITY ELEMENT
        int[] arr = {2, 2, 1, 2, 3};
        int n = arr.length;
        int majority = -1;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            if (count > n / 2) {
                majority = arr[i];
                break;
            }
        }

        if (majority != -1) {
            System.out.println("Majority Element: " + majority);
        } else {
            System.out.println("No Majority Element");
        }
    }
}
