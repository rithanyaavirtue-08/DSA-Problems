# Allocate Minimum Pages

## Problem Description
You have `n` books with pages in array `arr[]` and `k` students. You need to allocate books to students such that:
- Each student gets a contiguous set of books
- No book is left unallocated
- Each student gets at least one book
- The maximum pages a student reads is minimized

Find the minimum possible maximum pages any student has to read.

### Example
- Input: `arr = [12, 34, 67, 90]`, `k = 2`
- Output: `113`
- Explanation: Student 1 gets [12, 34, 67] = 113 pages, Student 2 gets [90] = 90 pages. Maximum = 113.

## Easy Explanation
Imagine distributing books to k students such that no one reads too many pages. You want to minimize the maximum workload.

The key insight: If you know the maximum pages a student can read, can you check if all k students can read all books? Yes! Binary search on the answer.

## Approach

**Step 1:** Find the range for binary search
- Minimum pages = maximum pages in a single book (each student must read at least one book)
- Maximum pages = total pages of all books (one student reads everything)

**Step 2:** Binary search on the answer
- For a given max pages limit, check if k students can read all books
- If yes, try a smaller limit (high = mid - 1), save answer
- If no, increase the limit (low = mid + 1)

**Step 3:** Count students needed for a given limit
- Greedily allocate books to each student until adding next book exceeds limit
- Move to next student and repeat

## Why Binary Search Works?
- If we can distribute books with max pages = X, we can also do it with X+1, X+2, etc.
- We search for the minimum X where distribution is possible
- This monotonic property makes binary search applicable

## Time Complexity
- O(n log(sum of pages)) where n = number of books, sum = total pages

## Space Complexity
- O(1) - only constant extra space

## Key Points to Remember
- Books must be allocated contiguously (no rearranging)
- Each student gets at least one book
- We minimize the maximum (not total)
- Binary search on answer, not on input array
- Greedy check within binary search for feasibility

