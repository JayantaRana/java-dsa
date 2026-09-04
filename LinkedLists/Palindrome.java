public class Palindrome {

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

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;// +1
            fast = fast.next.next;// +2
        }
        return slow;// midNode
    }

    public boolean checkPalindrome() {

        if (head == null || head.next == null) {
            return true;
        }
        // step1- find mid
        Node midNode = findMid(head);
        // step2-reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        Node right = prev;// right half head
        Node left = head;
        // step3- check left half & right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;

    }

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

    public static void main(String[] args) {
        Palindrome li = new Palindrome();
        li.addFirst(1);
        li.addFirst(2);
        li.addFirst(2);
        // li.addFirst(1);
        System.out.println(li.checkPalindrome());
    }
}