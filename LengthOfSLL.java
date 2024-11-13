class Node {
    int data;     
    Node next;
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
class SinglyLinkedList {
    Node head;
    public SinglyLinkedList() {
        this.head = null;
    }
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode; 
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}
public class Main {
    public static int findLength(SinglyLinkedList list) {
        int length = 0;
        Node current = list.head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }
    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        System.out.print("The list is: ");
        list.printList();
        int length = findLength(list);
        System.out.println("Length of the list: " + length);
    }
}