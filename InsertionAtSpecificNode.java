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

    public void insertBefore(Node next_node, int new_data) {
        if (next_node == null) {
            System.out.println("The given next node cannot be null.");
            return;
        }

        Node newNode = new Node(new_data);
        if (next_node == head) {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        else {
            newNode.prev = next_node.prev;
            newNode.next = next_node;
            next_node.prev.next = newNode;
            next_node.prev = newNode;
        }
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

    public Node findNode(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return current;
            }
            current = current.next;
        }
        return null;
    }
}

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.addNodeAtEnd(3);
        list.addNodeAtEnd(12);
        list.addNodeAtEnd(24);
        list.addNodeAtEnd(28);
        
        list.displayList();
        
        Node nextNode = list.findNode(24);
        if (nextNode != null) {
            list.insertBefore(nextNode, 17);
        }

        list.displayList();
    }
}
