public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        ListNode second = head;
        ListNode current = head;

        int length = 0;

        // Step 1: Find the length of the linked list
        while (current != null) {
            length++;
            if (length == k) first = current;
            current = current.next;
        }
        current = head;
        for (int i = 1; i <= length - k; i++) {
            current = current.next;
        }
        second = current;
        int temp = first.val;
        first.val = second.val;
        second.val = temp;
        return head;
    }
}
