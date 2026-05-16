# 1004. Max Consecutive Ones III

## Problem Description
Given a binary array `nums` and an integer `k`, you can flip at most `k` zeros to ones. Return the maximum number of consecutive 1's in the array after performing at most `k` flips.

### Example
- Input: `nums = [1,1,1,0,0,0,1,1,1,1,0]`, `k = 2`
- Output: `6`

## Easy explanation
We want the longest contiguous subarray that contains at most `k` zeros. Think of a window that expands to the right and only shrinks from the left when the number of zeros inside the window exceeds `k`.

## Approach (Sliding Window)
1. Use two pointers `left` and `right` to represent the current window (start and end indices).
2. Move `right` forward one step at a time and count zeros inside the window.
3. If the zero count becomes greater than `k`, move `left` forward until the zero count is again <= `k`.
4. At each step, update the maximum window length (right - left + 1).

This keeps a valid window (at most `k` zeros) and finds the largest one.

## Why it works
The sliding window maintains the largest valid contiguous subarray seen so far. Because we only move each pointer forward, the algorithm runs in linear time and checks every possible window implicitly without nested loops.

## Time Complexity
- O(n), where n is `nums.length`. Each index is visited at most twice (once by `right`, once by `left`).

## Space Complexity
- O(1). Only a few counters and pointers are used.

## Tips for future
- Keep track of the number of zeros in the window; you don't need to store the window contents.
- This pattern (expand right, shrink left when invalid) applies to many problems asking for longest/shortest subarray with a constraint.
- If asked to return the subarray indices, record the `left` and `right` when you update the maximum length.

## Key points to remember
- Sliding window is ideal when you need a longest/shortest contiguous subarray that satisfies a condition expressed by counts or sums.
- Always ensure your window invariants (here: zeros <= k) are maintained when you expand or shrink the window.

