package com.debasish.arraypractice.oneDimensionalArray;

import java.util.Stack;
public class OneDimensionalArray82 {
    public static void main(String[] args) {
        // PROBLEM 83: EVALUATE RPN
        String[] tokens = {"2", "1", "+", "3", "*"};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < tokens.length; i++) {
            String token = tokens[i];
            if (token.equals("+") || token.equals("-") ||
                    token.equals("*") || token.equals("/")) {
                int b = stack.pop();
                int a = stack.pop();
                int result = 0;
                if (token.equals("+")) {
                    result = a + b;
                } else if (token.equals("-")) {
                    result = a - b;
                } else if (token.equals("*")) {
                    result = a * b;
                } else {
                    result = a / b;
                }
                stack.push(result);

            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        System.out.println("Result: " + stack.pop());
    }
}