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

    public void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void traverseBackward() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }

        Node current = tail;
        System.out.println("Traversing backward from tail:");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.prev;
        }
        System.out.println();
    }
}

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.addNode(10);
        list.addNode(20);
        list.addNode(30);
        list.addNode(40);

        list.traverseBackward();
    }
}
