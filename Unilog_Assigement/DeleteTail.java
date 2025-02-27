public class DeleteEnd {  

  
    class Node{  
        int data;  
        Node previous;  
        Node next;  
          
        public Node(int data) {  
            this.data = data;  
        }  
    }  
      

    Node head, tail = null;  

    public void addNode(int data) {  
        Node newNode = new Node(data);  
          
        if(head == null) {  
            head = tail = newNode;  
            head.previous = null;  
            tail.next = null;  
        }  
        else {   
            tail.next = newNode;  
            newNode.previous = tail;  
            tail = newNode;   
            tail.next = null;  
        }  
    }  
      
    public void deleteFromEnd() {  
        if(head == null) {  
            return;  
        }  
        else {  
            if(head != tail) {   
                tail = tail.previous;  
                tail.next = null;  
            }   
            else {  
                head = tail = null;  
            }  
        }  
    }  
       
    public void display() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("List is empty");  
            return;  
        }   
  
            System.out.print(current.data + " ");  
            current = current.next;   
        System.out.println();  
    }  
      
    public static void main(String[] args) {  
          
        DeleteEnd dList = new DeleteEnd();  
        dList.addNode(1);  
        dList.addNode(2);  
        dList.addNode(3);  
        dList.addNode(4);  
        dList.addNode(5);  
          
        System.out.println("Original List: ");  
        dList.display();  
        while(dList.head != null) {  
            dList.deleteFromEnd();   
            System.out.println("Updated List: ");  
            dList.display();  
        }      
    }  
}  


