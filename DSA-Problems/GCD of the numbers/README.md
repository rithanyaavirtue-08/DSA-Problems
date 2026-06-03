# GCD of Numbers

## Problem Description
Find the **Greatest Common Divisor (GCD)** of two numbers. 

The GCD is the largest positive integer that divides both numbers without leaving a remainder.

### Example
- GCD(12, 8) = 4
  - Divisors of 12: 1, 2, 3, 4, 6, 12
  - Divisors of 8: 1, 2, 4, 8
  - Common divisors: 1, 2, 4
  - Greatest common divisor: 4

- GCD(18, 24) = 6
- GCD(17, 19) = 1 (prime numbers have GCD of 1)

## What is Euclidean Algorithm?
The Euclidean algorithm is an efficient method to find GCD using the principle:

**GCD(a, b) = GCD(b, a mod b)**

Keep replacing the larger number with the remainder until remainder becomes 0. The last non-zero number is the GCD.

## Easy Explanation
Imagine dividing the larger number by the smaller:
1. Divide a by b, get remainder r
2. Now find GCD of b and r
3. Repeat until remainder is 0
4. The last non-zero number is the GCD

**Example with 12 and 8:**
- 12 ÷ 8 = 1 remainder 4 → Now find GCD(8, 4)
- 8 ÷ 4 = 2 remainder 0 → Remainder is 0, so GCD is 4

## Approach
1. While b is not 0:
   - Store b in a temporary variable
   - Update b to a mod b (remainder)
   - Update a to temporary value (previous b)
2. When b becomes 0, return a (which is the GCD)

## Why Euclidean Algorithm?
- **Simple**: Easy to understand and implement
- **Efficient**: Works in O(log min(a, b)) time
- **Proven**: Mathematically proven to always find GCD

## Time Complexity
- O(log(min(a, b))) - Very fast, even for large numbers

## Space Complexity
- O(1) - Only using constant variables

## Real World Applications
- Simplifying fractions
- Finding common denominators
- Cryptography (RSA encryption)
- Music theory (rhythm patterns)
- Computer graphics (pixel calculations)

## Key Points to Remember
- GCD(a, b) = GCD(b, a mod b)
- Continue until b becomes 0
- The final value of a is the GCD
- Works for any positive integers

