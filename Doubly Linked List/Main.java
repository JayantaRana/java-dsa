class Node {
    int data;
    Node prev;
    Node next;

    Node(int data) {
        this.data = data;
        prev = null;
        next = null;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;

    DoublyLinkedList() {
        head = null;
        tail = null;

    }

    void insertAtBegining(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    void traverseForward() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        while (head != null) {
            System.out.print(head.data + " <-> ");
            head = head.next;
        }
        System.out.println("null");

    }

    void traverseBackward() {
        if (tail == null) {
            System.out.println("The list is empty.");
            return;
        }

        while (tail != null) {
            System.out.print(tail.data + " <-> ");
            tail = tail.prev;
        }
        System.out.println("null");

    }

    void insertMid(int data){
        
    }
}

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertAtBegining(10);
        list.insertAtEnd(20);
        list.insertAtBegining(5);
        list.traverseForward();
        list.traverseBackward();
    }

}
