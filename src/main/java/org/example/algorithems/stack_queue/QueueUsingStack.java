package org.example.algorithems.stack_queue;
import java.util.Stack;

public class QueueUsingStack {

	Stack<Integer> stack = new Stack<>();
	Stack<Integer> queue = new Stack<>();

	void enqueue(int value) {
		stack.push(value);
	}

	int dequeue() {
		if(queue.isEmpty()) {
			// move data from stack to queue stack
			while(!stack.isEmpty()) {
				queue.push(stack.pop());
			}
		}
		return queue.pop();
	}

    public static void main(String[] args) {
        QueueUsingStack queueUsingStack = new QueueUsingStack();
        queueUsingStack.enqueue(1);
        queueUsingStack.enqueue(2);
        queueUsingStack.enqueue(3);
        queueUsingStack.enqueue(4);
        System.out.println(queueUsingStack.stack);
        System.out.println(queueUsingStack.dequeue());
        System.out.println(queueUsingStack.dequeue());
        System.out.println(queueUsingStack.dequeue());
        System.out.println(queueUsingStack.dequeue());
    }
}
