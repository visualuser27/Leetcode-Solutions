Swapping Nodes in a Linked List

Problem Statement

Given the head of a linked list and an integer k, return the head after swapping the values of the k-th node from the beginning and the k-th node from the end (1-indexed).

Example 1:

Input: head = [1,2,3,4,5], k = 2
Output: [1,4,3,2,5]
Explanation: The 2nd node from the start (2) and the 2nd from the end (4) are swapped.

Example 2:

Input: head = [7,9,6,6,7,8,3,0,9,5], k = 5
Output: [7,9,6,6,8,7,3,0,9,5]

Constraints

The number of nodes in the list is n.

1 <= k <= n <= 10^5

0 <= Node.val <= 100

Problem Breakdown

Determine List Length:

Traverse the list to count the number of nodes.

Identify Nodes to Swap:

Find the k-th node from the beginning.

Find the k-th node from the end (using n - k + 1).

Swap Values:

Swap the values of the two nodes.

Code Implementation (Java)

class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        ListNode second = head;
        ListNode current = head;
        int length = 0;

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

Code Explanation
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode first = head;
        ListNode second = head;
        ListNode current = head;
        int length = 0;

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

Step 1: Calculate Length:

Use a single traversal to find the list length and the k-th node from the start.

Step 2: Locate the Nodes:

Use the length to find the k-th node from the end.

Step 3: Swap Values:

Swap the values of the identified nodes.

Complexity Analysis

Time Complexity: O(n)

Space Complexity: O(1)

