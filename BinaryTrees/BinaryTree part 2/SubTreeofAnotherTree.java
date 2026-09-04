
public class SubTreeofAnotherTree {

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

    public static boolean isIdentical(Node root, Node subroot) {
        if (root == null && subroot == null) {
            return true;
        } else if (root == null || subroot == null || root.data != subroot.data) {
            return false;
        }

        if (!isIdentical(root.left, subroot.left)) {
            return false;
        }

        if (!isIdentical(root.right, subroot.right)) {
            return false;
        }

        return true;
    }

    public static boolean isSubtree(Node root, Node subroot) {
        if (root == null) {
            return false;
        }
        if (root.data == subroot.data) {
            if (isIdentical(root, subroot)) {
                return true;
            }
        }

        return isSubtree(root.left, subroot) || isSubtree(root.right, subroot);
    }

    public static void main(String[] args) {

    }
}
