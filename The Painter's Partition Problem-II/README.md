# The Painter's Partition Problem-II

## Problem Description
Given an array `arr[]` representing the time taken to paint different boards and an integer `k` (number of painters), find the minimum time to paint all boards.

Constraints:
- Each painter paints boards in a contiguous manner (in order)
- No two painters can paint the same board
- Each painter works independently
- Goal is to minimize the maximum time any single painter takes

Return the minimum possible maximum time.

### Example
- Input: `arr = [5, 5, 5, 5]`, `k = 2`
- Output: `10`
- Explanation: Painter 1 paints [5, 5] (10 units), Painter 2 paints [5, 5] (10 units). Maximum = 10.

## Easy Explanation
You have several boards to paint and k painters available. Each painter paints boards in sequence (can't skip). You want to distribute the boards such that the painter with the most work has the least amount of work.

It's about dividing workload equally among painters where each painter gets a contiguous section of boards.

## Approach

**Step 1:** Set binary search bounds
- Low = maximum time in the array (slowest single board, at least one painter takes this)
- High = sum of all times (one painter paints everything)

**Step 2:** Binary search on the answer
- For a given max time limit, check if k painters can complete all boards
- If possible, try smaller time (high = mid - 1), save answer
- If not possible, increase time (low = mid + 1)

**Step 3:** Check feasibility for a given time limit
- Greedily assign boards to painters
- For each painter, keep adding boards until adding next board exceeds time limit
- Create new painter when limit exceeded
- Count total painters needed

## Why Binary Search Works?
- If k painters can finish in time X, they can also finish in X+1, X+2, etc.
- We search for the minimum time where k painters can complete all work
- This monotonic property makes binary search applicable

## Time Complexity
- O(n log(sum of times)) where n = number of boards, sum = total painting time

## Space Complexity
- O(1) - only constant extra space

## Key Points to Remember
- Boards must be painted in order (contiguous allocation)
- Each painter paints at least one board
- We minimize the maximum time (not total time)
- Binary search on answer, not on array indices
- Greedy feasibility check within binary search
- Similar to "Split Array Largest Sum" and "Allocate Minimum Pages"
- This is also known as "Painter's Partition Problem"

