package org.example.algorithems.tree;

import java.sql.SQLOutput;
import java.util.*;

class Tuple {
    Node node;
    int level;
    Tuple(Node node, int level) {
        this.node = node;
        this.level = level;
    }
}
public class VerticalLevelTraversal {

    void verticalLevelOrderTraversal(Node root) {

    }

    void queueExample() {
        Map<Integer, Map<Integer, Integer>> data = new HashMap<>();
        data.put(1, new HashMap<>(Map.of(1, 1)));
        data.put(2, new HashMap<>(Map.of(1, 1)));
        data.put(3, new HashMap<>(Map.of(1, 1)));
        System.out.println(data);

        PriorityQueue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                int n = o1.compareTo(o2);
                return Integer.compare(0, n);
            }
        });
        queue.add(10);
        queue.add(11);
        queue.add(1);
        queue.add(8);
        System.out.println(queue.offer(12));
//        System.out.println(queue.peek());
//        System.out.println(queue.poll());
//        System.out.println(queue.peek());
        System.out.println(queue);
        Iterator<Integer> iterator = queue.iterator();
        while (iterator.hasNext()) {
            System.out.println(queue.poll());
        }
    }

    void levelOrderTraversal(Node root) {
        if(root == null) {
            return;
        }
        Map<Integer, List<Integer>> levelTree = new HashMap<>();

        Queue<Tuple> queue = new LinkedList<>();
        queue.add(new Tuple(root, 0));
        while(!queue.isEmpty()) {
            Tuple tuple = queue.poll();
            int level = tuple.level;
            Node node = tuple.node;
            System.out.println(node.data);
            if(!levelTree.containsKey(tuple.level)) {
                levelTree.put(tuple.level, new ArrayList<>(List.of(node.data)));
            } else {
                levelTree.get(tuple.level).add(node.data);
            }
            level++;
            if(node.left != null) {
                queue.add(new Tuple(node.left, level));
            }
            if(node.right != null) {
                queue.add(new Tuple(node.right, level));
            }
        }
        System.out.println(levelTree);
    }

    void verticalTraversal() {
        BinaryTree binarySearchTree = new BinaryTree();
        binarySearchTree.add(11);
        binarySearchTree.add(12);
        binarySearchTree.add(19);
        binarySearchTree.add(3);
        binarySearchTree.add(23);
        binarySearchTree.add(7);
//        binarySearchTree.add(18);
//        binarySearchTree.add(17);
//        binarySearchTree.add(16);
//        binarySearchTree.add(15);
//        binarySearchTree.add(14);
//        binarySearchTree.add(13);
//        binarySearchTree.add(24);
        levelOrderTraversal(binarySearchTree.parent);
    }
    public static void main(String[] args) {
        new VerticalLevelTraversal().verticalTraversal();
    }
}
