
# Odd Even Linked List

## Problem Statement
Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

### Examples:
- Input: head = [1,2,3,4,5] -> Output: [1,3,5,2,4]
- Input: head = [2,1,3,5,6,4,7] -> Output: [2,3,6,7,1,5,4]

### Constraints:
- The number of nodes in the linked list is in the range [0, 10^4].
- -10^6 <= Node.val <= 10^6

---

## Approach
1. **Problem Understanding:**
   - Group all nodes with odd indices together, followed by nodes with even indices.
   - Maintain the relative order within both groups.

2. **Pointer Technique:**
   - Use two pointers, `odd` and `even`, to traverse the list.
   - Link odd nodes together and even nodes together.
   - At the end, connect the odd list to the head of the even list.

---

## Code Implementation

```java
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;

        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}
```

## Complexity Analysis
- **Time Complexity:** O(n) - Traverse the list once.
- **Space Complexity:** O(1) - Uses constant space.

## Edge Cases Considered:
1. Empty list.
2. List with a single node.
3. Alternating patterns of odd and even values.
