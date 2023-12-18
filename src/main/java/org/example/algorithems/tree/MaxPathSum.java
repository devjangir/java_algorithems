package org.example.algorithems.tree;

public class MaxPathSum {
    int diameter = 0;



    public int maxPathSum(Node root) {
        if(root == null) {
            return 0;
        }
        int lHeight = maxPathSum(root.left);
        int rHeight = maxPathSum(root.right);
        if(lHeight < 0) {
            lHeight = 0;
        }
        if(rHeight < 0) {
            rHeight = 0;
        }
        int maxHeight = Math.max(lHeight, rHeight) + root.data;
        diameter = Math.max(diameter, lHeight + rHeight);
        return maxHeight;
    }

    public int maxPathBinaryTree(Node root) {
        if(root == null) {
            return 0;
        }
        int lHeight = maxPathBinaryTree(root.left);
        int rHeight = maxPathBinaryTree(root.right);
        if(lHeight < 0) {
            lHeight = 0;
        }
        if(rHeight < 0) {
            rHeight = 0;
        }
        int maxHeight = Math.max(lHeight, rHeight) + root.data;
        diameter = Math.max(diameter, maxHeight);
        return maxHeight;
    }
    public static void main(String[] args) {
        String s = new String();

        BinaryTree binarySearchTree = new BinaryTree();

        binarySearchTree.add(11);
        binarySearchTree.add(12);
        binarySearchTree.add(19);
        binarySearchTree.add(3);
        binarySearchTree.add(23);
        binarySearchTree.add(7);
        binarySearchTree.add(18);
        binarySearchTree.add(17);
        binarySearchTree.add(16);
        binarySearchTree.add(15);
        binarySearchTree.add(14);
        binarySearchTree.add(13);
        binarySearchTree.add(24);
        MaxPathSum diameterBinaryTree = new MaxPathSum();
        diameterBinaryTree.maxPathBinaryTree(binarySearchTree.parent);
        System.out.println(diameterBinaryTree.diameter);
    }
}
