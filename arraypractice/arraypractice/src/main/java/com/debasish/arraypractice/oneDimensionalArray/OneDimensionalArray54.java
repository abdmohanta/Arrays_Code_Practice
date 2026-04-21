package com.debasish.arraypractice.oneDimensionalArray;
public class OneDimensionalArray54 {
    public static void main(String[] args) {
        // PROBLEM 55: LARGEST RECTANGLE IN HISTOGRAM
        int[] heights = {2, 1, 5, 6, 2, 3};
        int n = heights.length;
        int maxArea = 0;
        for (int i = 0; i < n; i++) {
            int minHeight = heights[i];
            for (int j = i; j < n; j++) {
                if (heights[j] < minHeight) {
                    minHeight = heights[j];
                }
                int width = j - i + 1;
                int area = minHeight * width;
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }
        System.out.println("Maximum Area: " + maxArea);
    }
}