import java.util.Scanner;

public class Practice2 {
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

    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        head = prev;

    }

    public void printLL() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Practice2 ll = new Practice2();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter  list size..");
        int n = sc.nextInt();

        System.out.println("enter list data...");
        for (int i = 1; i <= n; i++) {
            ll.add(sc.nextInt());
        }

        ll.printLL();
        ll.reverse();
        ll.printLL();

        sc.close();

    }
}