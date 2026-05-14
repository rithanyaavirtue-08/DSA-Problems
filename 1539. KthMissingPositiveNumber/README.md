# 1539. Kth Missing Positive Number

## Problem Description
Given an array `arr` of positive integers sorted in ascending order, and an integer `k`, find the `k-th` positive integer that is missing from the array.

### Example
- Input: `arr = [2,3,4,7,11]`, `k = 5`
- Output: `9`
- Explanation: Missing numbers are [1,5,6,8,9,10,11,...]. The 5th missing number is 9.

- Input: `arr = [1,2,3,4]`, `k = 2`
- Output: `6`
- Explanation: Missing numbers are [5,6,7,...]. The 2nd missing number is 6.

## Easy Explanation
Imagine you have a sorted array of positive numbers. Some numbers are missing from the sequence 1, 2, 3, 4, ...

You need to find which number is the k-th one that's missing.

The key insight: At position `mid`, if there are `missing` numbers before `arr[mid]`, then `missing = arr[mid] - (mid + 1)`. If missing is already `>= k`, the k-th missing number is to the left. Otherwise, it's to the right.

## Approach
1. Use binary search to find where the k-th missing number could be
2. For each mid position, calculate how many numbers are missing up to `arr[mid]`
3. Missing count = `arr[mid] - (position + 1)`
4. If missing >= k, search left (high = mid - 1)
5. Otherwise, search right (low = mid + 1)
6. Finally, return `low + k`

## Why Binary Search?
- The array is sorted, so we can narrow down the search range
- Binary search helps us find the boundary where k-th missing number lies
- Time complexity becomes O(log n) instead of O(n)

## Step-by-Step Example
With `arr = [2,3,4,7,11]`, `k = 5`:
- Missing numbers: 1 (at index 0), 5 (between 4 and 7), 6, 8, 9, 10, ...
- At arr[2]=4: missing = 4 - 3 = 1 (only 1 is missing)
- At arr[3]=7: missing = 7 - 4 = 3 (1, 5, 6 are missing)
- At arr[4]=11: missing = 11 - 5 = 6 (1, 5, 6, 8, 9, 10 are missing)
- Binary search will narrow down, and finally return: low + k = 4 + 5 = 9

## Time Complexity
- O(log n) - Binary search on the array

## Space Complexity
- O(1) - Only constant extra space

## Key Points to Remember
- The formula `arr[mid] - (mid + 1)` gives count of missing numbers up to position mid
- When binary search ends, `low` is at the first position where missing >= k
- The answer is `low + k` because there are `low` numbers in array + we need `k` more missing numbers
- Edge case: If all numbers are missing or k is large, answer continues beyond array length


