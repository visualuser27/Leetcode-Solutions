# Definition for singly-linked list.
from typing import Optional

class ListNode:
    def __init__(self, val=0, next=None):
        self.val = val
        self.next = next
class Solution:
    def removeElements(self, head: Optional[ListNode], val: int) -> Optional[ListNode]:
        dummy = ListNode(0)  # Create a dummy node
        dummy.next = head    # Point dummy to head to handle edge cases
        current = dummy      # Start from dummy
        while current and current.next:
            if current.next.val == val:
                current.next = current.next.next  # Skip the node with the value
            else:
                current = current.next            # Move to the next node
        return dummy.next