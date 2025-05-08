Finding the nth Digit in an Infinite Integer Sequence

Problem Statement

Given an integer n, return the n-th digit of the infinite integer sequence:

1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, ...

Example 1:

Input: n = 3
Output: 3

Example 2:

Input: n = 11
Output: 0
Explanation: The 11th digit is part of the number 10, so the output is 0.

Constraints

1 <= n <= 2^31 - 1

Problem Breakdown

Digits can have different lengths:

Numbers 1-9: 1-digit

Numbers 10-99: 2-digit

Numbers 100-999: 3-digit

And so on.

Find the range:

Check if n falls within 1-digit, 2-digit, 3-digit ranges, etc.

Locate the Exact Number:

Calculate the number that contains the n-th digit.

Extract the Digit:

Find the specific digit within the located number.

Code Implementation (Java)

class Solution {
    public int findNthDigit(int n) {
        int digitLength = 1;
        long count = 9;
        long start = 1;

        while (n > digitLength * count) {
            n -= digitLength * count;
            digitLength++;
            count *= 10;
            start *= 10;
        }

        long number = start + (n - 1) / digitLength;
        String numberStr = Long.toString(number);
        int index = (n - 1) % digitLength;
        return numberStr.charAt(index) - '0';
    }
}

Code Explanation
class Solution {
    public int findNthDigit(int n) {
        int digitLength = 1;
        long count = 9;
        long start = 1;

        while (n > digitLength * count) {
            n -= digitLength * count;
            digitLength++;
            count *= 10;
            start *= 10;
        }

        long number = start + (n - 1) / digitLength;
        String numberStr = Long.toString(number);
        int index = (n - 1) % digitLength;
        return numberStr.charAt(index) - '0';
    }
}

Step 1: Determine the Digit Length:

Start with 1-digit numbers and check the range.

Move to the next digit length when n is larger than the current range.

Step 2: Locate the Number:

Calculate the number that would contain the nth digit.

Step 3: Extract the Digit:

Convert the number to a string and extract the required digit.

Complexity Analysis

Time Complexity: O(log n)

Space Complexity: O(1)