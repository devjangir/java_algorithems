package org.example.algorithems.tree;

//class Node {
//    int data;
//    Node left;
//    Node right;
//    Node(int data) {
//        this.data = data;
//    }
//}
//public class BinarySearchTree {
//    Node parent;
//
//    public boolean isEmpty() {
//        return parent == null;
//    }
//
//    public boolean delete(int value, Node currentNode) {
//        // check for empty
//        if(isEmpty()) {
//            return false;
//        }
//
//        Node parent = null;
//        while(currentNode != null && currentNode.data != value) {
//            parent = currentNode;
//            if(currentNode.data > value) {
//                currentNode = currentNode.left;
//            } else {
//                currentNode = currentNode.right;
//            }
//        }
//        System.out.println(currentNode.data);
//        if(parent == null) {
//            return false;
//        }
//        // check if current node is leaf node
//        if(currentNode.left == null && currentNode.right == null) {
//            if(parent.left == currentNode) {
//                parent.left = null;
//            } else {
//                parent.right = null;
//            }
//            return true;
//        }
//
//        // check if left sub tree is null
//        if(currentNode.left == null) {
//            if(parent.left == currentNode) {
//                parent.left = currentNode.right;
//            } else {
//                parent.right = currentNode.right;
//            }
//            return true;
//        }
//
//        // check if right sub tree is null
//        if(currentNode.right == null) {
//            if(parent.left == currentNode) {
//                parent.left = currentNode.left;
//            } else {
//                parent.right = currentNode.left;
//            }
//            return true;
//        }
//        return false;
//    }
//
//    public boolean search(int value) {
//        if(parent == null) {
//            return false;
//        }
//        Node current = parent;
//        while(current != null) {
//            Node left = current.left;
//            Node right = current.right;
//            if(current.data == value) {
//                return true;
//            } else if(current.data > value) {
//                if(left != null) {
//                    current = left;
//                } else {
//                    return false;
//                }
//            } else {
//                if(right != null) {
//                    current = right;
//                } else {
//                    return false;
//                }
//            }
//        }
//        return false;
//    }
//
//    public boolean searchRecursive(Node parent, int value) {
//        if(parent == null) {
//            return false;
//        }
//        if(parent.data == value) {
//            return true;
//        }
//        if(parent.data > value) {
//            return searchRecursive(parent.left, value);
//        } else {
//            return searchRecursive(parent.right, value);
//        }
//    }
//    public Node recursiveAdd(Node current, int value) {
//
//        // Base Condition
//        if(current == null) {
//            return new Node(value);
//        }
//
//        // check for value
//        if(current.data > value) {
//            current.left = recursiveAdd(current.left, value);
//        } else {
//            current.right = recursiveAdd(current.right, value);
//        }
//        return current;
//
//    }
//    public boolean add(int value) {
//        if(isEmpty()) {
//            parent = new Node(value);;
//            return true;
//        }
//
//        // parent is not null and check for subtree to add
//        Node current = parent;
//        while(current != null) {
//            Node leftBinaryTree = current.left;
//            Node rightBinaryTree = current.right;
//            if(parent.data > value) {
//                if(leftBinaryTree != null) {
//                    current = leftBinaryTree;
//                } else {
//                    current.left = new Node(value);
//                    return true;
//                }
//            } else {
//                if(rightBinaryTree != null) {
//                    current = rightBinaryTree;
//                } else {
//                    current.right = new Node(value);
//                    return true;
//                }
//            }
//        }
//        return false;
//    }
//
//    public boolean recursiveAddition(int value) {
//        parent = recursiveAdd(parent, value);
//        return true;
//    }
//
//    // Preorder Traversal
//    public void preOrderTraversal(Node current) {
//        if(current == null) {
//            return;
//        }
//        System.out.print(current.data + " -> ");
//        preOrderTraversal(current.left);
//        preOrderTraversal(current.right);
//    }
//
//    public void inOrderTraversal(Node current) {
//        if(current == null) {
//            return;
//        }
//
//        inOrderTraversal(current.left);
//        System.out.print(current.data + " -> ");
//        inOrderTraversal(current.right);
//    }
//
//    public void printTree(Node current) {
//        if(current == null) {
//            return;
//        }
//        System.out.print(current.data + ", ");
//        printTree(current.left);
//        printTree(current.right);
//    }
//
//    public static void main(String[] args) {
//        BinarySearchTree binarySearchTree = new BinarySearchTree();
//        binarySearchTree.recursiveAddition(10);
//        binarySearchTree.recursiveAddition(5);
//        binarySearchTree.recursiveAddition(15);
//        binarySearchTree.recursiveAddition(3);
//        binarySearchTree.add(7);
//        binarySearchTree.add(13);
//        binarySearchTree.add(17);
//        binarySearchTree.printTree(binarySearchTree.parent);
//        System.out.println();
////        System.out.println(binarySearchTree.search(10));
////        System.out.println(binarySearchTree.search(56));
////
////        System.out.println(binarySearchTree.searchRecursive(binarySearchTree.parent, 10));
////        System.out.println(binarySearchTree.searchRecursive(binarySearchTree.parent, 100));
//        //binarySearchTree.delete(5, binarySearchTree.parent);
//        // binarySearchTree.printTree(binarySearchTree.parent);
//        System.out.println();
//        binarySearchTree.inOrderTraversal(binarySearchTree.parent);
//    }
//}
