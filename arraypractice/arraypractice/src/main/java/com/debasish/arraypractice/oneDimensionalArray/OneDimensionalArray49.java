package com.debasish.arraypractice.oneDimensionalArray;
public class OneDimensionalArray49 {
    public static void main(String[] args) {
        // PROBLEM 50: CONTAINER WITH MOST WATER
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int left = 0;
        int right = height.length - 1;
        int maxWater = 0;
        while (left < right) {
            int width = right - left;
            int minHeight = Math.min(height[left], height[right]);
            int water = width * minHeight;
            if (water > maxWater) {
                maxWater = water;
            }
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        System.out.println("Maximum Water: " + maxWater);
    }
}