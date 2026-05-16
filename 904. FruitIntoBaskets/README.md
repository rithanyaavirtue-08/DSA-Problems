# 904. Fruit Into Baskets

## Problem Description
You are given an array `fruits` where `fruits[i]` is the type of fruit on the i-th tree. You can pick fruits from trees in a row, but you have only two baskets and each basket can hold only one type of fruit (unlimited quantity of that type). Return the maximum number of fruits you can pick in total.

### Example
- Input: `fruits = [1,2,1]` → Output: `3` (pick all)
- Input: `fruits = [0,1,2,2]` → Output: `3` (pick `[2,2]` with one basket and `1` with the other)

## Easy explanation
We need the longest contiguous subarray that contains at most two distinct fruit types. Use a sliding window and a map to count fruit types inside the window. Expand the window to include new fruits; when there are more than two types, shrink the window from the left until only two types remain. Track the maximum window size seen.

## Approach (Sliding window + HashMap)
1. Use two pointers `left` and `right` for the window boundaries and a HashMap to store counts of each fruit type in the window.
2. Move `right` forward, incrementing the count for `fruits[right]`.
3. While the map has more than 2 keys (fruit types), decrement the count for `fruits[left]` and remove it from the map when its count reaches 0, then move `left` forward.
4. After each step, update the maximum window length `right - left + 1`.

## Why it works
The sliding window always represents a valid range with at most two fruit types. By expanding and shrinking while maintaining the invariant, we consider every candidate contiguous segment without nested loops.

## Time Complexity
- O(n), where n = `fruits.length`. Each index is visited at most twice.

## Space Complexity
- O(1) in practice, because the map holds at most 3 entries temporarily (we only care about at most 2 types), so constant extra space.

## Tips for future
- The same pattern applies to problems asking for the longest subarray with at most K distinct elements: use a hashmap + sliding window and adjust when distinct count exceeds K.
- If you need to return the actual subarray, record `left` and `right` when you update the maximum.

## Key points to remember
- Maintain counts, not just presence — counts let you know when to remove a fruit type.
- Expand right, shrink left when invariant violated.

