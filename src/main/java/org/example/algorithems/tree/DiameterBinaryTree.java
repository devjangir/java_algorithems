package org.example.algorithems.tree;
import org.example.algorithems.tree.BinaryTree;
public class DiameterBinaryTree {
    int diameter = 0;

    public int diameterHeight(Node root) {
        if(root == null) {
            return 0;
        }
        int lHeight = diameterHeight(root.left);
        int rHeight = diameterHeight(root.right);
        int maxHeight = Math.max(lHeight, rHeight) + 1;
        diameter = Math.max(diameter, lHeight + rHeight);
        return maxHeight;
    }

    public static void main(String[] args) {
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
        DiameterBinaryTree diameterBinaryTree = new DiameterBinaryTree();
        diameterBinaryTree.diameterHeight(binarySearchTree.parent);
        System.out.println(diameterBinaryTree.diameter);
    }
}
