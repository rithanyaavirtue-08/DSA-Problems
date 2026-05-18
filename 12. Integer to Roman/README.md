# 12. Integer to Roman

## Problem Description
Given an integer, convert it to a Roman numeral. You need to handle integers from 1 to 3999.

### Roman Numeral Symbols
- I = 1
- V = 5
- X = 10
- L = 50
- C = 100
- D = 500
- M = 1000

Special cases (subtractive notation):
- IV = 4 (5-1)
- IX = 9 (10-1)
- XL = 40 (50-10)
- XC = 90 (100-10)
- CD = 400 (500-100)
- CM = 900 (1000-100)

### Example
- Input: `num = 58`
- Output: `"LVIII"` (50 + 5 + 3 = L + V + III)

- Input: `num = 1994`
- Output: `"MCMXCIV"` (1000 + 900 + 90 + 4 = M + CM + XC + IV)

## Easy Explanation
The key insight is to use the **greedy approach**: always try to use the largest possible Roman numeral value.

Think of it like making change with coins. You have denomination values (including the special subtractive ones). For each number, use the largest denomination that fits, then move to the remainder.

Start with 1000, then 900, then 500, and so on. Whenever the current number is >= a value, append that Roman symbol and subtract the value.

## Approach
1. Create two parallel arrays:
   - One for numeric values (including special cases like 900, 400, 90, 40, 9, 4)
   - One for corresponding Roman symbols
2. Iterate through the values in descending order
3. While the number is >= current value:
   - Append the Roman symbol to the result
   - Subtract the value from the number
4. Continue until the number becomes 0
5. Return the result string

## Why This Works
- The greedy approach works because Roman numerals follow a strict structure
- By using the largest possible values first, we ensure the correct representation
- The special subtractive cases (like IV, IX) are already handled as separate values
- This is optimal and always produces a valid Roman numeral

## Time Complexity
- O(1) - The number is bounded (1-3999), so the loop runs a fixed maximum number of times

## Space Complexity
- O(1) - Only using constant extra space (the arrays are fixed size)

## Key Points to Remember
- Always use greedy approach (largest values first)
- Include special subtractive cases in your value array
- The order of values matters (must be descending)
- Roman numerals use specific subtraction rules (only certain combinations are valid)
- This is a straightforward mapping problem, not about complex algorithms


