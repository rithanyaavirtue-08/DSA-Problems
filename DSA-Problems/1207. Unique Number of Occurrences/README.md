# 1207. Unique Number of Occurrences

## Problem Description
Given an array of integers, check if all elements have **unique frequencies**. 

In other words, if an element appears x times in the array, no other element should appear x times.

Return `true` if all frequencies are unique, `false` otherwise.

### Example
- Input: `arr = [1,1,1,2,2,3]`
- Output: `true`
- Explanation: Frequency of 1 is 3, frequency of 2 is 2, frequency of 3 is 1. All unique frequencies: 3, 2, 1.

- Input: `arr = [1,1,1,1,1,1,1,2,2,2,2,2,2]`
- Output: `false`
- Explanation: Frequency of 1 is 7, frequency of 2 is 6. All unique.

- Input: `arr = [1,1,1,2,2,2,3,3,3]`
- Output: `false`
- Explanation: Frequency of 1, 2, and 3 are all 3. Not unique.

## Easy Explanation
1. Count how many times each element appears
2. Check if all these frequencies are different
3. If any two elements have the same frequency, return false
4. If all frequencies are different, return true

## Approach
1. Use a **HashMap** to count frequency of each element
2. Use a **HashSet** to store all frequencies
3. Compare: if set size = map size, all frequencies are unique
4. Or check each frequency - if you see a duplicate frequency, return false

## Why This Works
- HashMap tracks element frequencies
- HashSet automatically ensures all values are unique
- If frequencies are unique, set size equals map size

## Time Complexity
- O(n) - Single pass through array to count, plus checking frequencies

## Space Complexity
- O(n) - HashMap and HashSet to store frequencies

## Key Points to Remember
- Two different elements CAN have the same frequency (that's what we check)
- We only care about the frequencies, not the elements themselves
- HashSet helps detect duplicate frequencies instantly



