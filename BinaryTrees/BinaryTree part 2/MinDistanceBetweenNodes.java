class MinDistanceBetweenNodes {
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



     public static Node lca2(Node root, int n1, int n2) {
        if(root == null || root.data = n1 || root.data = n2) {
            return root;
        }
        Node leftLca = lca2(root.left,n1,n2);
        Node rightLca = lca2(root.right, n1,n2);
        if(rightLca == null) {
            return leftLca;
        }

        if(leftLca == null) {
            return rightLca;
        }

        return root;
    }

    public static int lcaDist(Node root, int n) {
        if(root == null) {
            return -1;
        }
        if(root.data == n) {
            return 0;
        }
        int leftDist = lcaDist(root.left,n);
        int rightDist = lcaDist(root.right, n);

        if(leftDist == -1 && rightDist == -1) {
            return - 1;

        } else if(leftDist == -1){
            return rightDist + 1;
        } else {
           return leftDist + 1
        }
    }
    public static int mindistance(Node root, int n1, int n2){
        Node lca = lca2(root,n1,n2);
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca,n2);

        return dist1 + dist2;

    }
}