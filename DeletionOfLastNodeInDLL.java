class Node {
    int data;
    Node next;
    Node prev;

    public Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList {
    Node head, tail;

    public DoublyLinkedList() {
        head = tail = null;
    }

    public void addNodeAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void deleteLastNode() {
        if (head == null) {
            System.out.println("The list is empty. No node to delete.");
            return;
        }

        if (head == tail) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }

        System.out.println("Last node deleted.");
    }

    public void displayList() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        Node current = head;
        System.out.println("Doubly Linked List:");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.addNodeAtEnd(3);
        list.addNodeAtEnd(17);
        list.addNodeAtEnd(24);
        list.addNodeAtEnd(28);

        list.displayList();
        list.deleteLastNode();
        list.displayList();
    }
}
