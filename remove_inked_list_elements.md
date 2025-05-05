# 203. Remove Linked List Elements

**Difficulty**: Easy  
**Topic**: Linked List

---

## 🚩 Problem Statement

Given the head of a linked list and an integer `val`, remove all the nodes of the linked list that have `Node.val == val`, and return the new head.

---

## ✨ Examples

### Example 1:
**Input**: `head = [1,2,6,3,4,5,6], val = 6`  
**Output**: `[1,2,3,4,5]`

### Example 2:
**Input**: `head = [], val = 1`  
**Output**: `[]`

### Example 3:
**Input**: `head = [7,7,7,7], val = 7`  
**Output**: `[]`

---

## 🔐 Constraints
- Number of nodes in the list: `0 <= nodes <= 10⁴`
- `1 <= Node.val <= 50`
- `0 <= val <= 50`

---

## ✅ Solution (Python)

```python
from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next

class Solution:
    def removeElements(self, head: Optional[ListNode], val: int) -> Optional[ListNode]:
        dummy = ListNode(0)
        dummy.next = head
        current = dummy

        while current and current.next:
            if current.next.val == val:
                current.next = current.next.next
            else:
                current = current.next

        return dummy.next