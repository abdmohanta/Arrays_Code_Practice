package com.debasish.arraypractice.oneDimensionalArray;
import java.util.Arrays;
public class OneDimensionalArray10 {
    public static void main(String[] args) {
        // PROBLEM 11: MERGE TWO ARRAYS
        int[] a = {1, 2, 3};
        int[] b = {4, 5, 6};
        int[] merge = new int[a.length + b.length];
        for (int i = 0; i < a.length; i++) {
            merge[i] = a[i];
        }
        for (int i = 0; i < b.length; i++) {
            merge[a.length + i] = b[i];
        }
        System.out.println("Merged Array: " + Arrays.toString(merge));
    }
}