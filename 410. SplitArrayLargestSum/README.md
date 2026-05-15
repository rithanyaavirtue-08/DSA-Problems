# 410. Split Array Largest Sum

## Problem Description
Given an array `nums` and an integer `k`, split the array into `k` non-empty contiguous subarrays such that the largest sum of any subarray is minimized.

Return the minimized largest sum of the split.

### Example
- Input: `nums = [7,2,5,10,8]`, `k = 2`
- Output: `18`
- Explanation: Split into [7,2,5] (sum=14) and [10,8] (sum=18), largest sum is 18.

## Easy Explanation
You need to split an array into k parts where each part is a contiguous section. The goal is to minimize the maximum sum among these parts.

Think of it as distributing the array elements into k groups, keeping them in order, and making sure the group with the highest sum is as small as possible.

## Approach

**Step 1:** Set binary search bounds
- Low = maximum element in array (each group needs at least one element)
- High = sum of all elements (one group takes everything)

**Step 2:** Binary search on the answer
- For a given max sum limit, check if we can split into k groups where no group exceeds this sum
- If possible, try smaller limit (high = mid - 1), save answer
- If not possible, increase limit (low = mid + 1)

**Step 3:** Check feasibility for a given limit
- Greedily add elements to current group until adding next would exceed limit
- Start new group when limit exceeded
- Count total groups needed

## Why Binary Search Works?
- If we can split with max sum = X, we can also do it with X+1, X+2, etc.
- We search for the minimum X where splitting into k groups is possible
- This monotonic property makes binary search perfect

## Time Complexity
- O(n log(sum of array)) where n = array length, sum = total elements

## Space Complexity
- O(1) - only constant extra space

## Key Points to Remember
- Subarrays must be contiguous (no rearranging elements)
- Each subarray must be non-empty
- We minimize the maximum subarray sum (not total sum)
- Binary search on answer, not on array indices
- Greedy feasibility check within binary search
- Similar to "Allocate Minimum Pages" problem
