class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
        next = null;
    }
}
public class Main {
    public static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
    public static ListNode copyList(ListNode head) {
        if (head == null) return null;
        ListNode newHead = new ListNode(head.val);
        ListNode current = head.next;
        ListNode copyCurrent = newHead;
        while (current != null) {
            copyCurrent.next = new ListNode(current.val);
            copyCurrent = copyCurrent.next;
            current = current.next;
        }
        return newHead;
    }
    public static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextNode = current.next;  
            current.next = prev;   
            prev = current;    
            current = nextNode;
        }
        return prev; 
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        ListNode originalCopy = copyList(head);
        System.out.print("Original list: ");
        printList(originalCopy);
        ListNode reversedHead = reverseList(head);
        System.out.print("Reversed list: ");
        printList(reversedHead);
        System.out.print("Original list (after reverse): ");
        printList(originalCopy);
    }
}