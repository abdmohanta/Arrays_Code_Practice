package com.debasish.arraypractice.oneDimensionalArray;

public class OneDimensionalArray54 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 55: LARGEST RECTANGLE IN HISTOGRAM
        // ======================================

        // Step 1: create array (heights)
        int[] heights = {2, 1, 5, 6, 2, 3};

        int n = heights.length;

        int maxArea = 0;

        // Step 2: brute force approach
        for (int i = 0; i < n; i++) {

            int minHeight = heights[i];

            for (int j = i; j < n; j++) {

                // update minimum height
                if (heights[j] < minHeight) {
                    minHeight = heights[j];
                }

                // calculate area
                int width = j - i + 1;
                int area = minHeight * width;

                // update max area
                if (area > maxArea) {
                    maxArea = area;
                }
            }
        }

        // Step 3: print result
        System.out.println("Maximum Area: " + maxArea);

    }
}