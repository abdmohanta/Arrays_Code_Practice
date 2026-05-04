package com.debasish.arraypractice.oneDimensionalArray;

import java.util.Stack;

public class OneDimensionalArray80 {

    public static void main(String[] args) {

        // ======================================
        // PROBLEM 81: VALID PARENTHESES
        // ======================================

        // Step 1: input string
        String s = "()[]{}";

        Stack<Character> stack = new Stack<>();

        boolean isValid = true;

        // Step 2: process characters
        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            // if opening bracket
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
            // if closing bracket
            else {

                if (stack.isEmpty()) {
                    isValid = false;
                    break;
                }

                char top = stack.pop();

                if ((ch == ')' && top != '(') ||
                        (ch == '}' && top != '{') ||
                        (ch == ']' && top != '[')) {

                    isValid = false;
                    break;
                }
            }
        }

        // Step 3: check result
        if (!stack.isEmpty()) {
            isValid = false;
        }

        // Step 4: print result
        if (isValid) {
            System.out.println("Valid Parentheses");
        } else {
            System.out.println("Invalid Parentheses");
        }

    }
}