package com.debasish.arraypractice.oneDimensionalArray;
public class OneDimensionalArray19 {
    public static void main(String[] args) {
        // PROBLEM 20: INTERSECTION OF TWO ARRAYS
        int[] a = {1, 2, 3, 4};
        int[] b = {3, 4, 5, 6};
        System.out.println("Intersection Elements:");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    System.out.println(a[i]);
                    break;
                }
            }
        }
    }
}