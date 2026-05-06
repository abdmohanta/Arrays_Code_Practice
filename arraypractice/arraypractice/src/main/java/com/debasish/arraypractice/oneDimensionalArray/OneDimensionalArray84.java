package com.debasish.arraypractice.oneDimensionalArray;

import java.util.Stack;

public class OneDimensionalArray84 {

    public static void main(String[] args) {
        // PROBLEM 85: ASTEROID COLLISION
        int[] asteroids = {5, 10, -5};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < asteroids.length; i++) {
            int current = asteroids[i];
            boolean exploded = false;
            while (!stack.isEmpty()
                    && current < 0
                    && stack.peek() > 0) {
                int top = stack.peek();
                if (Math.abs(current) > top) {
                    stack.pop();
                    continue;
                }

                else if (Math.abs(current) == top) {
                    stack.pop();
                }

                exploded = true;
                break;
            }

            if (!exploded) {
                stack.push(current);
            }
        }

        // Step 3: print remaining asteroids
        System.out.println("Remaining Asteroids:");

        for (int val : stack) {
            System.out.print(val + " ");
        }

    }
}