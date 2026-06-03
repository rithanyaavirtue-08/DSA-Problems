# 875. Koko Eating Bananas

## Problem Description
Koko loves to eat bananas. There are `n` piles of bananas, the `i-th` pile has `piles[i]` bananas. The guards have gone and will come back in `h` hours.

Koko can decide her bananas-per-hour eating speed `k`. Each hour, she chooses some pile and eats `k` bananas from it. If the pile has less than `k` bananas, she eats all of them instead and won't eat any more that hour.

Find the minimum integer `k` such that she can eat all the bananas within `h` hours.

### Example
- Input: `piles = [3,6,7,11]`, `h = 8`
- Output: `4`
- Explanation: With k=4, she eats: 3/4=1h, 6/4=2h, 7/4=2h, 11/4=3h → total 8h.

## Easy Explanation
Imagine Koko has to eat all bananas in limited time. She eats at speed k (bananas per hour).

For each pile, time needed = ceil(pile / k). Total time = sum of these for all piles.

We need total time <= h, and find smallest k.

Since k can be from 1 to max pile, we use binary search on k.

## Approach
1. Set low = 1, high = maximum pile size
2. While low <= high:
   - mid = (low + high) / 2
   - Calculate total time if Koko eats at speed mid
   - If total time <= h, try smaller speed (high = mid - 1), save mid as possible answer
   - Else, need faster speed (low = mid + 1)
3. Return the saved answer

## Why Binary Search?
- k ranges from 1 to max pile
- We can check if a k works in O(n) time
- Binary search gives O(n log max_pile) time

## Time Complexity
- O(n log M) where n = piles.length, M = max pile

## Space Complexity
- O(1)
