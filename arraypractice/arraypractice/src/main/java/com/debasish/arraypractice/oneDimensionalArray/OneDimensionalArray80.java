package com.debasish.arraypractice.oneDimensionalArray;

import java.util.Stack;
public class OneDimensionalArray80 {
    public static void main(String[] args) {
        // PROBLEM 81: VALID PARENTHESES
        String s = "()[]{}";
        Stack<Character> stack = new Stack<>();
        boolean isValid = true;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            }
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

        if (!stack.isEmpty()) {
            isValid = false;
        }

        if (isValid) {
            System.out.println("Valid Parentheses");
        } else {
            System.out.println("Invalid Parentheses");
        }

    }
}