# 240. Search a 2D Matrix II

## Problem Description
Search for a target value in a 2D matrix where:
- Integers in each row are sorted in ascending order
- Integers in each column are sorted in ascending order

Return `true` if the target is found, otherwise return `false`.

### Example
- Input: `matrix = [[1,4,7,11],[2,5,8,12],[3,6,9,16],[10,13,14,17]]`, `target = 13`
- Output: `true`

- Input: `matrix = [[1,4,7,11],[2,5,8,12],[3,6,9,16],[10,13,14,17]]`, `target = 18`
- Output: `false`

## Approach
The solution uses **binary search on each row**:
1. Loop through each row of the matrix
2. Perform binary search on that row to find the target
3. If found, return `true`
4. If not found in any row, return `false`

This works because each row is sorted independently.

## Complexity Analysis
- **Time Complexity**: O(m × log n) - where m is the number of rows and n is the number of columns (binary search on each row)
- **Space Complexity**: O(1) - only constant extra space used

## Optimized Approach
A more efficient solution exists using a staircase approach (O(m + n)), where you start from top-right or bottom-left corner and eliminate a row or column with each comparison.


