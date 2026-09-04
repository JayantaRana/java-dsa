public class ReverseLinkedList {
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

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;// <- assign right to left
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

}
