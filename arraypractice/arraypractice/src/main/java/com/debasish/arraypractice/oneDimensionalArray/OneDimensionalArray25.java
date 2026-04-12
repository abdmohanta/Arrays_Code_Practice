package com.debasish.arraypractice.oneDimensionalArray;
public class OneDimensionalArray25 {
    public static void main(String[] args) {
        // PROBLEM 26: TRAPPING RAIN WATER
        int[] height = {3, 0, 2, 0, 4};
        int n = height.length;
        int[] leftMax = new int[n];
        leftMax[0] = height[0];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        int totalWater = 0;
        for (int i = 0; i < n; i++) {
            int water = Math.min(leftMax[i], rightMax[i]) - height[i];
            totalWater = totalWater + water;
        }
        System.out.println("Total Trapped Water: " + totalWater);
    }
}