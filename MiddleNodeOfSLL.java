class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}
public class Main {
    public static ListNode findMiddle(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode slow = head; 
        ListNode fast = head; 
        while (fast != null && fast.next != null) {
            slow = slow.next; 
            fast = fast.next.next; 
        }
        return slow; 
    }
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }
    public static ListNode addNode(ListNode head, int value) {
        ListNode newNode = new ListNode(value);
        if (head == null) {
            head = newNode;
        } else {
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;
    }
    public static void main(String[] args) {
        ListNode head = null;
        head = addNode(head, 1);
        head = addNode(head, 2);
        head = addNode(head, 3);
        head = addNode(head, 4);
        head = addNode(head, 5);
        printList(head);
        ListNode middleNode = findMiddle(head);
        if (middleNode != null) {
            System.out.println("Middle node value: " + middleNode.val);
        } else {
            System.out.println("The list is empty.");
        }
    }
}