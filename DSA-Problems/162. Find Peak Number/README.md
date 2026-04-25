# 162. Find Peak Element

## Problem
Find a peak element in an array. 
A peak is an element strictly greater than its neighbors. 
Return any peak's index. Assume `nums[-1] = -∞` and `nums[n] = -∞`.

**Example:**
- Input: `[1,2,3,1]` → Output: `2` (3 is peak)
- Input: `[1,2,1,3,5,6,4]` → Output: `1` or `5` (2 or 6 are peaks)

## Approach
Use binary search. If `nums[mid] > nums[mid+1]`, 
peak is left (set high=mid). Else, peak is right (set low=mid+1). Loop until low==high.




