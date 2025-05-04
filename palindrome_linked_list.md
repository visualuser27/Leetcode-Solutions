✅ 2. `palindrome_linked_list.md`

```markdown
# ✅ Problem: Palindrome Linked List

## 🔍 Goal
Check if a **singly linked list** is a palindrome — i.e., the values are the same forward and backward.

---

## 🔁 What’s a Palindrome?

Examples:
- [1, 2, 2, 1] → Palindrome ✅
- [1, 2] → Not a palindrome ❌

---

## 💡 Approach

### Strategy:
1. **Find the middle** of the list using the fast and slow pointer method
2. **Reverse** the second half of the list
3. Compare the first half and reversed second half
4. If all elements match → It’s a palindrome

### Why This Works:
- Doesn’t require extra space (no need to store the list in an array)
- Works in `O(n)` time and `O(1)` space

---

## ✅ Code (Python)

```python
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        # Step 1: Find the middle node
        slow, fast = head, head
        while fast and fast.next:
            slow = slow.next
            fast = fast.next.next

        # Step 2: Reverse the second half of the list
        prev = None
        while slow:
            next_node = slow.next
            slow.next = prev
            prev = slow
            slow = next_node

        # Step 3: Compare the first and second half
        left, right = head, prev
        while right:
            if left.val != right.val:
                return False
            left = left.next
            right = right.next

        return True
🧪 Example
Input: 1 → 2 → 2 → 1 → Output: True

Input: 1 → 2 → Output: False

✅ Why It’s Efficient
Only reverses half the list

Doesn’t use extra memory (no array or stack)

Best solution for checking palindrome in linked lists

💡 Bonus Tip
You can restore the reversed half after comparison if the original list must remain unchanged.

