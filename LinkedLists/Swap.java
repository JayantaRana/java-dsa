class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Swap {
    public ListNode swapPairs(ListNode head) {
        // Create a dummy node to act as the predecessor of the head
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;

        // Traverse the list in pairs
        while (current.next != null && current.next.next != null) {
            ListNode first = current.next;
            ListNode second = current.next.next;

            // Swapping logic
            first.next = second.next;
            second.next = first;
            current.next = second;

            // Move the pointer forward by two nodes for the next pair
            current = first;
        }

        return dummy.next;
    }

    // Helper to print the list
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Swap sol = new Swap();

        // Example 1: 1 -> 2 -> 3 -> 4
        ListNode head1 = new ListNode(1);
        head1.next = new ListNode(2);
        head1.next.next = new ListNode(3);
        head1.next.next.next = new ListNode(4);
        System.out.print("Input: 1 2 3 4 -> Output: ");
        sol.printList(sol.swapPairs(head1)); // Expected: 2 1 4 3

        // Example 2: 1 -> 2 -> 3
        ListNode head2 = new ListNode(1);
        head2.next = new ListNode(2);
        head2.next.next = new ListNode(3);
        System.out.print("Input: 1 2 3 -> Output: ");
        sol.printList(sol.swapPairs(head2)); // Expected: 2 1 3
    }
}
