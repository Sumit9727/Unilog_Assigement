class FindThroughIndex {

  static class Node {
    int data;
    Node next;

    Node(int data) {
      this.data = data;
    }
  }

  static Node push(Node head, int new_data) {
    Node new_node = new Node(new_data);

    new_node.data = new_data;

    new_node.next = head;

    head = new_node;

    return head;
  }

  static int GetNth(Node head, int n) {
    int count = 0;
    if (head == null) return -1;
    if (count == n) return head.data;

    return GetNth(head.next, n - 1);
  }

  public static void main(String args[]) {
    Node head = null;

    head = push(head, 1);
    head = push(head, 4);
    head = push(head, 1);
    head = push(head, 12);
    head = push(head, 1);

    System.out.printf("Element at index 1 is %d", GetNth(head, 1));
  }
}
