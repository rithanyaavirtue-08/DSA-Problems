# 643. Maximum Average Subarray I

## Problem Description
Given an integer array `nums` and an integer `k`, find a contiguous subarray of length `k` that has the maximum average value.

Return the maximum average value as a double.

### Example
- Input: `nums = [1,12,-5,-6,50,3]`, `k = 4`
- Output: `12.75000`
- Explanation: Subarray [12, -5, -6, 50] has the maximum average = (12 - 5 - 6 + 50) / 4 = 51 / 4 = 12.75

## What is Sliding Window?
A sliding window is a technique where you maintain a fixed-size window of elements and slide it through the array.

Instead of recalculating the sum from scratch for each window, you:
1. Add the next element to the right
2. Remove the leftmost element
3. This keeps the window size constant while moving

## Easy Explanation
Imagine a window of size k sliding over the array:
- First window: elements at index 0 to k-1
- Next window: elements at index 1 to k
- Keep sliding until you reach the end

For each position, calculate the sum and track the maximum sum.

## Approach
1. **Create first window**: Add first k elements and store their sum
2. **Store as max**: This is our initial maximum sum
3. **Slide the window**: For each new position:
   - Add the new right element
   - Remove the leftmost element
   - Update maximum if new sum is greater
4. **Calculate average**: Maximum sum / k

## Why Sliding Window?
- Without it: For each subarray, recalculate sum = O(n * k)
- With sliding window: Calculate sum once, then update in O(1) = O(n)

## Time Complexity
- O(n) where n = length of array (single pass through array)

## Space Complexity
- O(1) (only using constant variables)

## Key Points to Remember
- Window size is fixed at k
- Only add one element and remove one element per iteration
- Track the maximum sum found so far
- Final answer is maximum sum divided by k

