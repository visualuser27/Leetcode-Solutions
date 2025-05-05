# 202. Happy Number

**Difficulty**: Easy  
**Topic**: Math, Hashing

---

## 🚩 Problem Statement

Write an algorithm to determine if a number `n` is a happy number.

A **happy number** is defined by this process:

1. Starting with any positive integer, replace the number by the sum of the squares of its digits.
2. Repeat the process until the number equals 1, or it loops endlessly in a cycle which does not include 1.
3. If it ends in 1, the number is happy.

---

## ✨ Examples

### Example 1:
**Input**: `n = 19`  
**Output**: `true`  
**Explanation**:
1² + 9² = 82
8² + 2² = 68
6² + 8² = 100
1² + 0² + 0² = 1 ✅

yaml
Copy
Edit

### Example 2:
**Input**: `n = 2`  
**Output**: `false`  

---

## 🔐 Constraints

- `1 <= n <= 2³¹ - 1`

---

## ✅ Solution (Python)

```python
class Solution:
    def isHappy(self, n: int) -> bool:
        seen = set()

        while n != 1:
            if n in seen:
                return False
            seen.add(n)
            n = sum(int(digit) ** 2 for digit in str(n))

        return True
