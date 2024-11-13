class Node {
    int data;
    Node address;

    public Node(int data) {
        this.data = data;
        this.address = null;
    }
}

public class Linkedlist {
        Node head , tail;
        int size;
        public Linkedlist(){
            head=tail=null;
            size=0;
        }
        public void add(int d)
        {
            Node n = new Node(d);
            if(head==null) {
                head=tail=n;
            }
            else{
                tail.address=n;
                tail=n;
                
            }
            size++;
        }
        
         public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.address;
            
        }
        System.out.println();
    }
          public static void main(String[] args) {
              Linkedlist list =new Linkedlist();
              list.add(1);
              list.add(2);
              list.add(3);
              list.add(4);
           list.printList();
           System.out.println("size of list: "+list.size);

          } }