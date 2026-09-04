import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SwapInPairs {

    public static Node swapPairs(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node prev = null;
        Node first = head;
        Node sec = head.next;

        while (first != null && sec != null) {
            Node third = sec.next;
            sec.next = first;
            first.next = third;

            if (prev != null) {
                prev.next = sec;
            } else {
                head = sec;
            }

            // update
            prev = first;
            first = third;

            if (third != null) {
                sec = third.next;
            } else {
                sec = null;
            }
        }
        return head;
    }

    // Helper to print the list
    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data);
            if (head.next != null) {
                System.out.print(",");
            }
            head = head.next;

        }
        System.out.println();
    }

    // Convert input string "1,2,3,4" to linked list
    public static Node buildList(String input) {
        String[] parts = input.split(",");
        Node dummy = new Node(0);
        Node curr = dummy;
        for (String p : parts) {
            curr.next = new Node(Integer.parseInt(p.trim()));
            curr = curr.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string format 1,2,3,4");

        String input = sc.nextLine();
        Node head = buildList(input);

        Node swapped = swapPairs(head);
        printList(swapped);
    }
}