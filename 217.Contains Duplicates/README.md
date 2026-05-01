# 217. Contains Duplicates

## Problem Description
Given an integer array `nums`, return `true` if any value appears at least twice in the array, and return `false` if every element is distinct.

### Example
- Input: `nums = [1,2,3,1]`
- Output: `true`
- Explanation: The element 1 appears twice.

- Input: `nums = [1,2,3,4]`
- Output: `false`
- Explanation: All elements are distinct.

## Easy Explanation
Imagine you have a list of numbers. You need to check if any number repeats. If yes, return true; if all are unique, return false.

## Approach
1. Use a HashSet to store unique elements as you iterate through the array
2. For each number:
   - If it's already in the set, return true (duplicate found)
   - If not, add it to the set
3. If you finish checking all numbers without finding duplicates, return false

## Why HashSet?
- HashSet allows O(1) average time for add and contains operations
- Perfect for checking uniqueness quickly

## Time Complexity
- O(n) - We iterate through the array once, each operation is O(1) on average

## Space Complexity
- O(n) - In worst case, all elements are unique and stored in the set

## Key Points to Remember
- HashSet is ideal for uniqueness checks
- Early return when duplicate is found saves time
- Works for any data type that can be hashed
- Alternative: Sort array and check adjacent elements (O(n log n) time)
