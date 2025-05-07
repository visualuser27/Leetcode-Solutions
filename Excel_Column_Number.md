
# Excel Sheet Column Number

## Problem Statement
Given a string `columnTitle` that represents the column title as appears in an Excel sheet, return its corresponding column number.

### Examples:
- Input: "A" -> Output: 1
- Input: "AB" -> Output: 28
- Input: "ZY" -> Output: 701

### Constraints:
- 1 <= columnTitle.length <= 7
- columnTitle consists only of uppercase English letters.
- The input is in the range ["A", "FXSHRXW"].

---

## Approach
1. **Problem Understanding:**
   - Excel columns are represented like "A", "B", ..., "Z", "AA", "AB", ..., and so on.
   - Essentially, it's a base-26 numeral system where 'A' corresponds to 1, 'B' to 2, and so on.
   
2. **Mathematical Formulation:**
   - Convert each character to its numerical value using:
     \[
     	ext{value} = 	ext{ord(char)} - 	ext{ord('A')} + 1
     \]
   - Accumulate the result as:
     \[
     	ext{result} = 	ext{result} 	imes 26 + 	ext{value}
     \]

---

## Code Implementation

```python
class Solution:
    def titleToNumber(self, columnTitle: str) -> int:
        result = 0
        for char in columnTitle:
            result = result * 26 + (ord(char) - ord('A') + 1)
        return result
```

## Complexity Analysis
- **Time Complexity:** O(n) - Where n is the length of the input string.
- **Space Complexity:** O(1) - Uses constant space.

## Edge Cases Considered:
1. Single character title (e.g., "A", "Z").
2. Longest possible title of length 7.
3. Consecutive letters (e.g., "AA", "AB").
