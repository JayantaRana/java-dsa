import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
public class TopViewOfTree {
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
    static class Info {
        Node node;
        int hd;
        public Info(Node node, int hd) {
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root) {
        Queue<Info> q = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();
        int min = 0, max = 0;
        q.add(new Info(root, 0));
        
    }
    public static void main(String[] args) {
        
    }
}
