public class Node{
    private int value;
    private Node next;
    private Node prev;
    
    public Node(int value,int next,int prev){
        this.value = value;
        this.next = null;
        this.prev = null;
        
    }
    public head = null;
    public tail = null;
    
    public void addNode(int value){
        Node newNode = new Node(data);
          if(head == null) {    
            head = newNode;    
            tail = newNode;    
        }    
        else {    
            tail.next = newNode;    
            tail = newNode;    
        }
    }
    public void display() {    
        Node current = head;    
            
        if(head == null) {    
            System.out.println("List is empty");    
            return;    
        }    
        System.out.println("Nodes of singly linked list: ");    
        while(current != null) {    
            System.out.print(current.data + " ");    
            current = current.next;    
        }    
        System.out.println();    
    }    
    
}
