class AddAtIndex{
public void add(int index, E element) {
	if (index < 0 || index > numElements) 
		throw new InvalidArgumentException();
	Node<E> newNode = new Node<E>(element);
	if (head == null) {		
		head = newNode;
		tail = newNode;
	}
	else if (index == 0) {			
		newNode.next = head;
		head.prev = newNode;
		head = newNode;
	}
	else if (index == numElements) { 	
		newNode.prev = tail;
		tail.next = newNode;
		tail = newNode;
	}
	else {					
		Node<E> nodeRef = head;
		for (int i = 1; i < index; i++) 
			nodeRef = nodeRef.next;
		// nodeRef now points to the node before the insert point
		// see course notes for pictures!
		newNode.next = nodeRef.next;
		nodeRef.next = newNode;
		newNode.prev = nodeRef;
		newNode.next.prev = newNode;
	}
	numElements++;
}

}


