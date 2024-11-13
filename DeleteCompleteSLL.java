class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
class Main {
    public static void deleteList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            ListNode nextNode = current.next;
            current.next = null;
            current = nextNode;
        }
        head = null; 
    }
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        System.out.print("Original list: ");
        printList(head);
        deleteList(head);
        System.out.print("List after deletion: ");
        printList(head); 
    }
}