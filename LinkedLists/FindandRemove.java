//Find and remove Nth node from end
public class FindandRemove {
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

    public void deleteNthfromEnd(int n) {
        // calculate size
        int size = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            size++;
        }
        if (n == size) {
            head = head.next;// remove first
            return;
        }

        int i = 1;
        int iToFind = size - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return;
    }

    public static void main(String[] args) {
        FindandRemove li = new FindandRemove();
        li.addFirst(10);
        li.addFirst(50);
        li.addFirst(53);
        li.addFirst(20);
        li.printLL();
        li.deleteNthfromEnd(3);
        li.printLL();
    }
}
