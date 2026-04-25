# 3. Longest Substring Without Repeating Characters

## Problem Description
Given a string `s`, find the length of the longest substring without repeating characters.

### Example
- Input: `s = "abcabcbb"`
- Output: `3`
- Explanation: The answer is "abc", with the length of 3.

- Input: `s = "bbbbb"`
- Output: `1`
- Explanation: The answer is "b", with the length of 1.

- Input: `s = "pwwkew"`
- Output: `3`
- Explanation: The answer is "wke", with the length of 3.

## What is Sliding Window?
Sliding window is a technique where we maintain a "window" of elements and slide it through the data structure to find something optimal.

For this problem, we use a window to track the current substring without duplicates.

## Easy Explanation
Imagine walking through the string with two pointers:
- `i` (left pointer): Start of current window
- `j` (right pointer): End of current window, expanding right

Use a map to track last seen position of each character.

When you find a duplicate:
- Move `i` to the right of the previous occurrence
- Update the map
- Calculate current window length (j - i + 1)
- Keep track of maximum length

## Approach
1. Use a HashMap to store character → last index
2. Initialize left pointer `i = 0`, max length = 0
3. For right pointer `j` from 0 to length-1:
   - If character at j is in map and its index >= i:
     - Move i to map.get(char) + 1
   - Update map with current j
   - Update max length = max(max, j - i + 1)
4. Return max length

## Why This Works
- HashMap helps find duplicates quickly
- Moving i skips the duplicate part
- Window always contains unique characters
- We check all possible substrings efficiently

## Time Complexity
- O(n) - Each character is visited at most twice (once by j, once by i)

## Space Complexity
- O(min(n, 128)) - HashMap stores at most 128 ASCII characters

## Key Points to Remember
- Use sliding window for substring problems
- HashMap tracks last seen index
- Move left pointer when duplicate found
- Calculate length as j - i + 1
- Works for all ASCII characters
