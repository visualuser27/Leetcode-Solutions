# Problem: 2095. Delete the Middle Node of a Linked List

## Problem Description:

You are given the head of a singly linked list. Your task is to delete the middle node and return the head of the modified linked list.

The middle node of a linked list is the ⌊n / 2⌋-th node from the start, where ⌊x⌋ denotes the largest integer less than or equal to x. We use 0-based indexing to count the nodes.

### Key Observations:
- If the list has only one node, the result will be an empty list (i.e., `null`).
- For a list of even length, the middle node will be the ⌊n / 2⌋-th node (i.e., one of the two middle nodes).

### Example Walkthrough:

#### Example 1:
**Input:**
head = [1, 3, 4, 7, 1, 2, 6]

makefile
Copy
Edit
**Output:**
[1, 3, 4, 1, 2, 6]

markdown
Copy
Edit
- Middle node is at index 3 (node with value 7). We remove it.
- The list after removal becomes: `[1, 3, 4, 1, 2, 6]`.

#### Example 2:
**Input:**
head = [1, 2, 3, 4]

makefile
Copy
Edit
**Output:**
[1, 2, 4]

markdown
Copy
Edit
- Middle node is at index 2 (node with value 3). We remove it.
- The list after removal becomes: `[1, 2, 4]`.

#### Example 3:
**Input:**
head = [2, 1]

makefile
Copy
Edit
**Output:**