package org.example.algorithems.linkedlist;
class DoublyLinkedlist {
	static class Node {
		int value;
		Node next;
		Node prev;
		Node(int value) {
			this.value = value;
			this.next = null;
			this.prev = null;
		}
	}

	// Store head 
	Node head;
	int size;

	boolean isEmpty() {
		return size == 0 || head == null;
	}

	void insertAtHead(Node node) {
		if(isEmpty()) {
			head = node;
			size++;
			return;
		}
		node.next = head;
		head.prev = node;
		head = node;
		size++;
	}

	void deleteAtHead() {
		if(isEmpty()) {
			return;
		}
		head = head.next;
		head.prev = null;
		size--;
	}

	void deleteByValue(int value) {
		if(isEmpty()) {
			return;
		}
		if(head.value == value) {
			deleteAtHead();
			return;
		}
		Node temp = head;
		while(temp != null) {
			if(temp.value == value) {
				temp.prev.next = temp.next;
				if(temp.next != null) {
					temp.next.prev = temp.prev;
				}
				size--;
			}
			temp = temp.next;
		}
	}

	void deleteTail() {
		if(isEmpty()) {
			return;
		}
		if(size == 1) {
			head = null;
			size--;
			return;
		}
		Node temp = head;
		Node prev = null;
		while(temp.next != null) {
			prev = temp;
			temp = temp.next;
		}
		prev.next = null;
		size--;
	}

	boolean detectLoop() {
		Node slow = head;
		Node fast = head;
		while(slow != null && fast != null && fast.next != null) {
			
			slow = slow.next;
			fast = fast.next.next;
			if(slow == fast) {
				return true;
			}
		}
		return false;
	}

	void printLinkedList() {
		Node temp = head;
		while(temp != null) {
			System.out.print(temp.value + " => ");
			temp = temp.next;
		}
	}
}

class DemoDoubleLinkedList {
	public static void main(String[] args) {
		DoublyLinkedlist linkedList = new DoublyLinkedlist();
		linkedList.insertAtHead(new DoublyLinkedlist.Node(1));
		linkedList.insertAtHead(new DoublyLinkedlist.Node(2));
		linkedList.insertAtHead(new DoublyLinkedlist.Node(3));
//		linkedList.insertAtHead(new DoublyLinkedlist.Node(4));
//		linkedList.insertAtHead(new DoublyLinkedlist.Node(5));
		linkedList.printLinkedList();
		System.out.println();
//		linkedList.deleteAtHead();
//		linkedList.printLinkedList();
//		System.out.println();
//		linkedList.deleteTail();
//		linkedList.printLinkedList();
//		System.out.println();
//		linkedList.deleteByValue(3);
//		linkedList.printLinkedList();
//		System.out.println();
//		linkedList.deleteByValue(2);
//		linkedList.printLinkedList();

		System.out.println(linkedList.detectLoop());
		linkedList.head.next.next.next = linkedList.head;
		System.out.println(linkedList.detectLoop());
	}
}