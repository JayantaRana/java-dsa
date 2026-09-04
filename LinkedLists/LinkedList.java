
public class LinkedList {

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
    public static int size;

    public void addFirst(int data) { // time complexity: O(1)
        // step-1: create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step-2: newNode next =head
        newNode.next = head;// Link
        // step-3: head =newNode
        head = newNode;

    }

    public void addLast(int data) { // time complexity: O(1)
        // step-1: create new node
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        // step-2: tail.next =newNode
        tail.next = newNode;
        // step-3 : tail =newNode
        tail = newNode;

    }

    public void addMiddle(int data, int idx) {
        if (idx == 0) {
            addFirst(data);
            return;
        }

        // step-1: find prev index
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;
        while (i < idx - 1) { // find prev
            temp = temp.next;
            i++;
        }
        // i =idx-1; temp -> prev
        newNode.next = temp.next; // step-2
        temp.next = newNode; // step-3

    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            // } else if (size == 1) {
            // int val = head.data;
            // head = tail = null;
            // return val;
        }
        int val = head.data;
        head = head.next;

        return val;
    }

    public void removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;

        System.out.println(val);
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

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.printLL();
        ll.addFirst(1);
        ll.printLL();
        ll.addFirst(2);
        ll.printLL();
        ll.addFirst(3);
        // ll.printLL();
        // ll.addLast(4);
        // ll.printLL();
        // ll.addLast(5);
        ll.printLL();
        ll.addMiddle(5, 2);
        // ll.printLL();
        // System.out.println(ll.size);

        // ll.removeFirst();
        ll.printLL();

    }
}
