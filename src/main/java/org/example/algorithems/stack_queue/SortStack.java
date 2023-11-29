package org.example.algorithems.stack_queue;

import java.util.Stack;

public class SortStack {
	Stack<Integer> sortStack(Stack<Integer> stack) {
		Stack<Integer> tempStack = new Stack<>();

		// check while stack is not empty
		while(!stack.isEmpty()) {
			// get first element and check with temp stack if there any item less than current element
			Integer current = stack.pop();
			if(!tempStack.isEmpty() && current >= tempStack.peek()) {
				tempStack.push(current);
			} else {
				while(!tempStack.isEmpty() && current < tempStack.peek()) {
					stack.push(tempStack.pop());
				}
				tempStack.push(current);
			}
		}
		return tempStack;
	}

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(5);
        stack.push(2);
        stack.push(4);
        stack.push(1);
        stack.push(3);
        Stack<Integer> result = new SortStack().sortStack(stack);
        System.out.println(result);
    }
}
