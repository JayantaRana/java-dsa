public class LinkedlistPrac {
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

  public static void AddFirst(int data) {

    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
      return;
    }
    newNode.next = head;
    head = newNode;

  }

  public static void addLast(int data) {
    Node newNode = new Node(data);
    if (head == null) {
      head = tail = newNode;
    }
    tail.next = newNode;
    tail = newNode;
  }

  public static void addMiddle(int data, int idx) {

    if (idx == 0) {
      AddFirst(data);
      return;
    }
    Node newNode = new Node(data);
    Node temp = head;
    int i = 0;
    while (i <= idx - 1) {
      temp = temp.next;
      i++;
    }
    newNode.next = temp.next;
    temp.next = newNode;
  }

  public static void printLL() {
    if (head == null) {
      System.out.println("LL is empty");
    }
    Node temp;
    temp = head;
    while (temp != null) {
      System.out.print(temp.data + "->");
      temp = temp.next;
    }
    System.out.println("null");
  }

  public static void main(String[] args) {
    LinkedlistPrac li = new LinkedlistPrac();
    li.AddFirst(10);
    li.AddFirst(20);
    li.AddFirst(40);
    li.printLL();
    li.addMiddle(90, 2);

    li.printLL();
  }
}
