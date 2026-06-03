# 1482. Minimum Number of Days to Make m Bouquets

## Problem Description
You have `n` flowers, each blooming on day `bloomDay[i]`. You need to make `m` bouquets, each requiring `k` adjacent flowers. Find the minimum number of days to wait to make `m` bouquets. If impossible, return -1.

### Example
- Input: `bloomDay = [1,10,3,10,2]`, `m = 3`, `k = 1`
- Output: `3`
- Explanation: On day 3, all flowers bloom, can make 3 bouquets of 1 flower each.

## Easy Explanation
Imagine flowers bloom on different days. You need groups of k flowers next to each other for each bouquet. Find the earliest day where you have enough such groups.

## Approach
1. If total flowers needed (m*k) > total flowers, impossible (-1)
2. Binary search on days: low = min bloom day, high = max bloom day
3. For each mid day, count how many bouquets you can make (count adjacent flowers <= mid)
4. If bouquets >= m, try earlier day (high = mid-1)
5. Else, need later day (low = mid+1)
6. Return the minimum day found

## Why Binary Search?
- Days range from min to max bloom day
- Can check feasibility in O(n) time
- Binary search gives O(n log D) where D is day range

## Time Complexity
- O(n log D) - n for checking, log D for binary search

## Space Complexity
- O(1) - only constant variables

## Key Points
- Check if m*k > n first
- Count bouquets by tracking adjacent bloomed flowers
- Binary search minimizes the day
