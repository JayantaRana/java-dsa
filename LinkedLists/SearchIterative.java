public class SearchIterative {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirst(int data) { // time complexity: O(1)
        // step-1: create new node
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step-2: newNode next =head
        newNode.next = head;// Link
        // step-3: head =newNode
        head = newNode;

    }

    public void printLL() { // time complexity: O(n)
        if (head == null) {
            System.out.println("LL is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");// alt+26
            temp = temp.next;
        }
        System.out.println("null");

    }

    public static int searchIterative(int key) {

        int i = 0;
        Node temp = head;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }

            temp = temp.next;
            i++;
        }
        return -1;
    }

    // recursive search
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;

    }

    public int recSearch(int key) {
        return helper(head, key);
    }

    public static void main(String[] args) {
        SearchIterative li = new SearchIterative();
        li.addFirst(1);
        li.addFirst(2);
        li.addFirst(3);
        li.addFirst(4);
        li.printLL();
        System.out.println(li.searchIterative(4));

    }
}
