import java.util.Scanner;

class Node {
    char data;
    Node next;
    Node prev;

    public Node(char data) {
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

    public void addCharacter(char c) {
        Node newNode = new Node(c);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void removeLastCharacter() {
        if (head == null) {
            return; 
        }

        if (head == tail) {
            head = tail = null; 
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    public void removeCharacterAt(int position) {
        if (head == null || position < 0) return;

        Node current = head;
        int index = 0;

        while (current != null && index < position) {
            current = current.next;
            index++;
        }

        if (current != null) {
            if (current == head) {
                head = head.next;
                if (head != null) {
                    head.prev = null;
                }
            } 
            else if (current == tail) {
                tail = tail.prev;
                if (tail != null) {
                    tail.next = null;
                }
            } else {
                current.prev.next = current.next;
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
            }
        }
    }

    public void updateCharacterAt(int position, char newChar) {
        if (head == null || position < 0) return;

        Node current = head;
        int index = 0;

        while (current != null && index < position) {
            current = current.next;
            index++;
        }

        if (current != null) {
            current.data = newChar;
        }
    }

    public String displayText() {
        StringBuilder text = new StringBuilder();
        Node current = head;
        while (current != null) {
            text.append(current.data);
            current = current.next;
        }
        return text.toString();
    }
}

public class Main {

    private static DoublyLinkedList textList = new DoublyLinkedList();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("Simple Text Editor");
            System.out.println("1. Insert Text");
            System.out.println("2. Remove Last Character");
            System.out.println("3. Modify Character");
            System.out.println("4. Display Text");
            System.out.println("5. Exit");

            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1:
                    insertText();
                    break;
                case 2:
                    removeLastCharacter();
                    break;
                case 3:
                    modifyCharacter();
                    break;
                case 4:
                    displayText();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        }
    }

    private static void insertText() {
        System.out.print("Enter text to insert: ");
        String text = scanner.nextLine();
        for (char c : text.toCharArray()) {
            textList.addCharacter(c);
        }
    }

    private static void removeLastCharacter() {
        textList.removeLastCharacter();
    }

    private static void modifyCharacter() {
        System.out.print("Enter position to modify: ");
        int position = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter new character: ");
        char newChar = scanner.nextLine().charAt(0);

        textList.updateCharacterAt(position, newChar);
    }

    private static void displayText() {
        System.out.println("Current text: " + textList.displayText());
    }
}
