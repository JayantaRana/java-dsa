package BinaryTrees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    static class BinaryTrees {
        static int idx = -1;

        public static Node buildTree(int nodes[]) {
            idx++;
            if (nodes[idx] == -1) {
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);
            return newNode;
        }

        public static void preOrder(Node root) {
            if (root == null) {
                // System.out.print("-1" + " ");
                return;
            }

            System.out.print(root.data + " ");
            preOrder(root.left);
            preOrder(root.right);
        }

        public static void inOrder(Node root) {
            if (root == null) {
                return;
            }
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);

        }

        public static void postOrder(Node root) {
            if (root == null) {
                return;
            }
            postOrder(root.left);
            postOrder(root.right);
            System.out.print(root.data + " ");

        }

        public static void levelOrder(Node root) {
            if (root == null) {
                return;
            }
            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);
            while (!q.isEmpty()) {
                Node curr = q.remove();
                if (curr == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);
                    }
                } else {
                    System.out.println(curr.data);
                    if (curr.left != null) {
                        q.add(curr.left);
                    }
                    if (curr.right != null) {
                        q.add(curr.right);
                    }
                }
            }
        }

        public static int height(Node root) {
            if (root == null) {
                return 0;
            }
            int lh = height(root.left);
            int rh = height(root.right);

            return Math.max(lh, rh) + 1;

        }

        public static int countNodes(Node root) {
            if (root == null) {
                return 0;
            }
            int lcount = countNodes(root.left);
            int rcount = countNodes(root.right);
            return lcount + rcount + 1;
        }

        public static int nodeSum(Node root) {
            if (root == null) {
                return 0;
            }
            int lsum = nodeSum(root.left);
            int rsum = nodeSum(root.right);
            return lsum + rsum + root.data;
        }

    }

    public static void main(String args[]) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryTrees tree = new BinaryTrees();
        Node root = tree.buildTree(nodes);
        // System.out.println(root.data);
        // tree.preOrder(root);
        // tree.inOrder(root);
        tree.postOrder(root);
        tree.levelOrder(root);

    }
}
