- Middle node is at index 1 (node with value 1). We remove it.
- The list after removal becomes: `[2]`.

## Solution Explanation:

The problem can be approached using a two-pointer technique:

1. **Two pointers:** We use two pointers `slow` and `fast`. The `slow` pointer moves one step at a time, while the `fast` pointer moves two steps at a time.
2. **Prev pointer:** We also maintain a `prev` pointer that tracks the node before the `slow` pointer. This helps in deleting the middle node when the `slow` pointer reaches the middle of the list.
3. **Fast pointer reaches the end:** When the `fast` pointer reaches the end of the list, the `slow` pointer will be at the middle. The `prev` pointer will then point to the node just before the middle node.
4. **Remove the middle node:** Once the `slow` pointer is at the middle, we adjust the `prev.next` to skip over the middle node.

### Code:

```java
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
        // Edge case: if there's only one node, return null (empty list)
        if (head == null || head.next == null) return null;
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        // Use two-pointer technique to find the middle node
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Remove the middle node by adjusting the next pointer of the previous node
        prev.next = slow.next;

        return head;
    }
}
