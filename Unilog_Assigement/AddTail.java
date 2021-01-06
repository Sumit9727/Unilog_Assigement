Class AddTail{
void append(int new_data)
{
	Node new_node = new Node(new_data);
 
    Node last = head; 
    new_node.next = null;
 
   if (head == null) {
        new_node.prev = null;
        head = new_node;
        return;
    }
  while (last.next != null)
        last = last.next;
 last.next = new_node;
  new_node.prev = last;
}

}

