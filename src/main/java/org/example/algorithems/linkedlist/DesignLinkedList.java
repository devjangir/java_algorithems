package org.example.algorithems.linkedlist;

class LinkedList {
    // Definition for singly-linked list.
    static class Node {
        int value;
        Node next;
        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    Node head;
    int size;
    // Helper function
    void insertAtEnd(Node node) {
        if(size == 0) {
            head = node;
        } else {
            Node temp = head;
            while(temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        size++;
    }

    // add node at the beginning
    void addAtHead(Node node) {
        node.next = head;
        head = node;
        size++;
    }

    void deleteNode(int index) {
        System.out.println("index: "+index+" size: "+size);
        if(index >= size) {
            return;
        }
        if(index == 0) {
            head = head.next;
        } else {
            Node temp = head;
            for(int i=0;i<index - 1;i++) {
                temp = temp.next;
            }
            System.out.println("------"+temp.value);
            temp.next = temp.next.next;
        }
        size--;
    }

    void deleteNodeByValue(int value) {
        if(head.value == value) {
            head = head.next;
            size--;
        }
        Node currentNode = head;
        Node previousNode = null;
        while(currentNode != null) {
            if(currentNode.value == value) {
                previousNode.next = currentNode.next;
                size--;
                break;
            }
            previousNode = currentNode;
            currentNode = currentNode.next;
        }
    }
    // get the value at index
    int get(int index) {
        if(index >= size) {
            return -1;
        }
        Node temp = head;
        for(int i=0;i<index;i++) {
            temp = temp.next;
        }
        return temp.value;
    }


    // Print the linked list
    void printList() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
    }
}
public class DesignLinkedList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(new LinkedList.Node(10));
        list.insertAtEnd(new LinkedList.Node(20));
        list.insertAtEnd(new LinkedList.Node(30));
        list.insertAtEnd(new LinkedList.Node(40));
        list.addAtHead(new LinkedList.Node(50));
        list.printList();
        System.out.println(list.get(0));
        System.out.println(list.get(4));
        System.out.println(list.get(2));
        list.deleteNode(0);
        System.out.println("after deleting the node at index 0");
        list.printList();
        list.deleteNodeByValue(10);
        System.out.println("after deleting the node at index 3");
        list.printList();
        list.deleteNodeByValue(40);
        System.out.println("after deleting the node at index 4");
        list.printList();
    }
}
