package org.example.algorithems.tree;


class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
    }
}
public class BinaryTree {
    Node parent;

    public boolean isEmpty() {
        return parent == null;
    }
    public boolean add(int value) {
        if(isEmpty()) {
            parent = new Node(value);;
            return true;
        }

        // parent is not null and check for subtree to add
        Node current = parent;
        while(current != null) {
            Node leftBinaryTree = current.left;
            Node rightBinaryTree = current.right;
            if(current.data > value) {
                if(leftBinaryTree != null) {
                    current = leftBinaryTree;
                } else {
                    current.left = new Node(value);
                    return true;
                }
            } else {
                if(rightBinaryTree != null) {
                    current = rightBinaryTree;
                } else {
                    current.right = new Node(value);
                    return true;
                }
            }
        }
        return false;
    }

    public void printTree(Node current) {
        if(current == null) {
            return;
        }
        System.out.print(current.data + ", ");
        printTree(current.left);
        printTree(current.right);
    }
}