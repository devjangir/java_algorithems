package org.example.algorithems.stack_queue;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    boolean isValid(String expression) {
        Stack<Character> stack = new Stack<>();
        for(Character c: expression.toCharArray()) {
            if(c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if(stack.isEmpty()) {
                    return false;
                }
                Character top = stack.peek();
                if((c == ')' && top == '(') || (c == '}' && top == '{') || (c == ']' && top == '[')) {
                    stack.pop();
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(new ValidParentheses().isValid("()"));
        System.out.println(new ValidParentheses().isValid("()[]{}"));
        System.out.println(new ValidParentheses().isValid("(]"));
        System.out.println(new ValidParentheses().isValid("([)]"));
        System.out.println(new ValidParentheses().isValid("{[]}"));
    }
}
