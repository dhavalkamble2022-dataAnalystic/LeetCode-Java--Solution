class Node { 
    int data; 
    Node next; 

    Node(int data) { 
        this.data = data; 
    } 
} 
 
class MyLinkedList { 
    Node head; 
    int size; 
 
    public MyLinkedList() { 
        size = 0; 
        head = null; 
    } 
     
    public int get(int index) { 
        if(index < 0 || index >= size) { 
            return -1; 
        } 

        Node temp = head; 

        for(int i = 0; i < index; i++) { 
            temp = temp.next; 
        } 

        return temp.data; 
    } 
     
    public void addAtHead(int val) { 
        Node node = new Node(val); 

        if(head == null) { 
            head = node; 
        } 
        else { 
            node.next = head; 
            head = node; 
        } 

        size++; 
    } 
     
    public void addAtTail(int val) { 
        Node node = new Node(val); 

        if(head == null) { 
            head = node; 
        } 
        else { 
            Node temp = head; 

            while(temp.next != null) { 
                temp = temp.next; 
            } 

            temp.next = node; 
        } 

        size++; 
    } 
     
    public void addAtIndex(int index, int val) { 

        if(index < 0 || index > size) { 
            return; 
        } 

        if(index == 0) { 
            addAtHead(val); 
            return; 
        } 

        if(index == size) { 
            addAtTail(val); 
            return; 
        } 

        Node node = new Node(val); 
        Node temp = head; 

        for(int i = 0; i < index - 1; i++) { 
            temp = temp.next; 
        } 

        node.next = temp.next; 
        temp.next = node; 

        size++; 
    } 
     
    public void deleteAtIndex(int index) { 

        if(index < 0 || index >= size) { 
            return; 
        } 

        if(index == 0) { 
            head = head.next; 
        } 
        else { 
            Node temp = head; 

            for(int i = 0; i < index - 1; i++) { 
                temp = temp.next; 
            } 

            temp.next = temp.next.next; 
        } 

        size--; 
    } 
}