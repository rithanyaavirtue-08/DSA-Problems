# 1423. Maximum Points You Can Obtain from Cards

## Problem Description
You are given an integer array `cardPoints` and an integer `k`. In one step, you can take either the first or the last card from the remaining array. Your goal is to take exactly `k` cards such that the sum of their points is maximized.

Return the maximum points you can obtain.

### Example
- Input: `cardPoints = [1,2,3,4,5,6,1]`, `k = 3`
- Output: `12`
- Explanation: After taking the first card (1), the last card (1), and another last card (6), you have 1+1+6=8. But better is taking the last 3 cards: 6+5+4=15. Wait, let me recalculate... Taking first (1), first (2), and last (1) gives 1+2+1=4. Taking last 3 (6,5,4) gives 15. But the answer is 12, which is taking first card (1) and last two cards (6+5)=12.

## Easy Explanation
Imagine you have cards in a row. You can pick `k` cards, but ONLY from either end (left or right). You want the maximum sum.

Key insight: If you take k cards total, you can take `i` cards from left and `k-i` cards from right (for all possible values of i from 0 to k).

So try all combinations:
- 0 from left, k from right
- 1 from left, k-1 from right
- 2 from left, k-2 from right
- ... and so on up to k from left, 0 from right

Find which combination gives the maximum sum.

## Approach
1. Calculate the sum of the first k cards (all from left)
2. Incrementally replace left cards with right cards:
   - Remove one card from the left
   - Add one card from the right
   - Track the maximum sum at each step
3. Return the maximum sum found

## Why This Works
- We only need to consider combinations of taking from left end and right end
- By iterating through all k+1 possible combinations, we're guaranteed to find the maximum
- Each step efficiently updates the sum by removing one left card and adding one right card

## Time Complexity
- O(k) - We iterate k times to try all combinations

## Space Complexity
- O(1) - Only using constant extra space

## Key Points to Remember
- Can only pick from either end (first or last)
- Must pick exactly k cards
- Try all combinations of left and right picks
- This is a two-pointer/sliding window variant problem
- More efficient than trying all possible k-card combinations with brute force


