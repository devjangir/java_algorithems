package org.example.algorithems.tree;

class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
    }
}
public class BinarySearchTree {
    Node parent;

    public boolean isEmpty() {
        return parent == null;
    }

    public Node recursiveAdd(Node current, int value) {

        // Base Condition
        if(current == null) {
            return new Node(value);
        }

        // check for value
        if(current.data > value) {
            current.left = recursiveAdd(current.left, value);
        } else {
            current.right = recursiveAdd(current.right, value);
        }
        return current;

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
            if(parent.data > value) {
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

    public boolean recursiveAddition(int value) {
        parent = recursiveAdd(parent, value);
        return true;
    }

    public void printTree(Node current) {
        if(current == null) {
            return;
        }
        System.out.print(current.data + ", ");
        printTree(current.left);
        printTree(current.right);
    }

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.recursiveAddition(10);
        binarySearchTree.recursiveAddition(5);
        binarySearchTree.recursiveAddition(15);
        binarySearchTree.recursiveAddition(3);
        binarySearchTree.add(7);
        binarySearchTree.add(13);
        binarySearchTree.add(17);
        binarySearchTree.printTree(binarySearchTree.parent);
    }
}
