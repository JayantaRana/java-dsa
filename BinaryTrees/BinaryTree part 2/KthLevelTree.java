import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class KthLevelTree {

    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static void klevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.println(root.data + " ");
            return;
        }
        klevel(root.left, level + 1, k);
        klevel(root.right, level + 1, k);
    }

    // level order traversal
    public static ArrayList<ArrayList<Integer>> leveltravelsal(Node root) {
        ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        Queue<Node> q = new LinkedList<>();
        if (root == null) {
            return mainlist;
        }
        q.offer(root);
        while (!q.isEmpty()) {
            int levelNum = q.size();
            ArrayList<Integer> sublist = new ArrayList<>();
            for (int i = 0; i < levelNum; i++) {
                if (q.peek().left != null) {
                    q.offer(q.peek().left);
                }
                if (q.peek().right != null) {
                    q.offer(q.peek().right);
                }
                sublist.add(q.poll().data);
            }
            mainlist.add(sublist);
        }
        return mainlist;

    }


    //find maxximum level sum
      public static int leveltravelsalsum(TreeNode root) {
        // ArrayList<ArrayList<Integer>> mainlist = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();
        int maxSum = Integer.MIN_VALUE;
        int level = 1;
        int maxlevel = 1;
        if (root == null) {
            return -1;
        }
        q.offer(root);
        while (!q.isEmpty()) {
            int levelNum = q.size();
            // ArrayList<Integer> sublist = new ArrayList<>();
            int levelsum = 0;
            for (int i = 0; i < levelNum; i++) {
                if (q.peek().left != null) {
                    q.offer(q.peek().left);
                }
                if (q.peek().right != null) {
                    q.offer(q.peek().right);
                }
                levelsum += q.poll().val;
            }
            if(levelsum > maxSum) {
                maxSum = levelsum;
                maxlevel = level;
            }
            level++;
        }
        return maxlevel;

    }


    public static void main(String args[]) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        klevel(root, 1, 3);
        System.out.println("----");
        System.out.println(leveltravelsal(root));
    }
}
