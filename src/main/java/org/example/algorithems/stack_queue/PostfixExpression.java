package org.example.algorithems.stack_queue;

import java.util.Stack;

public class PostfixExpression {

	Integer evaluatePostFix(String expression) {
		Stack<Integer> stack = new Stack<>();
		for(int index = 0; index<expression.length(); index++) {
			char c = expression.charAt(index);
			if(Character.isDigit(c)) {
				stack.push(c - '0');
			} else {
				Integer value1 = stack.pop();
                Integer value2 = stack.pop();
                switch(c) {
                	case '+':
                		stack.push(value1+value2);
                		break;
                	case '-':
                		stack.push(value1-value2);
                		break;
            		case '*':
            			stack.push(value1*value2);
            			break;
            		case '/':
            			stack.push(value1/value2);
            			break;
                }
			}
		}
		return stack.pop();
	}

    public static void main(String[] args) {
        System.out.println(new PostfixExpression().evaluatePostFix("231*+9-"));
    }
}
