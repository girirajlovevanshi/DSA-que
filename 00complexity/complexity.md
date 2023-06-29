complexity refers to the analysis of how efficient an algorithm is in terms of two key factors:

Time Complexity: Measures how the time taken by an algorithm scales with the size of the input.
Space Complexity: Measures how the memory usage of an algorithm scales with the size of the input.

1. Time Complexity
Time complexity is expressed using Big-O notation, which describes the upper bound on the time required as a function of the input size (n). The most common types of time complexity are:

Common Types of Time Complexities:
Constant Time – O(1):

The running time does not change with the input size.
Example: Accessing an element in an array by index.
Logarithmic Time – O(log n):

The time increases logarithmically as the input size increases.
Example: Binary search in a sorted array.
Linear Time – O(n):

The time increases directly with the size of the input.
Example: Traversing an array.
Linearithmic Time – O(n log n):

This complexity is often seen in efficient sorting algorithms like Merge Sort or Quick Sort.
Example: Sorting a list with Merge Sort.
Quadratic Time – O(n²):

The time increases quadratically as the input size grows.
Example: Nested loops, such as in Bubble Sort or Insertion Sort.
Cubic Time – O(n³):

Similar to quadratic, but with three nested loops.
Example: Matrix multiplication algorithms.
Exponential Time – O(2^n):

The time doubles with each additional element in the input.
Example: Solving problems with brute force, like the Traveling Salesman Problem (TSP).
Factorial Time – O(n!):

The time grows factorially, which is very slow.
Example: Generating all permutations of a set.