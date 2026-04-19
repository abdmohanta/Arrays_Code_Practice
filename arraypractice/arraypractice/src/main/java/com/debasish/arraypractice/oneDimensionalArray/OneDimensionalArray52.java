package com.debasish.arraypractice.oneDimensionalArray;
import java.util.Arrays;
public class OneDimensionalArray52 {
    public static void main(String[] args) {
        // PROBLEM 53: STOCK SPAN
        int[] price = {100, 80, 60, 70, 60, 75, 85};
        int n = price.length;
        int[] span = new int[n];
        for (int i = 0; i < n; i++) {
            span[i] = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (price[j] <= price[i]) {
                    span[i]++;
                } else {
                    break;
                }
            }
        }
        System.out.println("Stock Span: " + Arrays.toString(span));
    }
}