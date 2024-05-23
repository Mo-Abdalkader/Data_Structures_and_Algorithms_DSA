# Binary Search: A Comprehensive Guide

## Table of Contents
1. [Introduction](#introduction)
2. [Key Concepts](#key-concepts)
3. [How It Works](#how-it-works)
4. [Pros and Cons](#pros-and-cons)
5. [Java Examples](#java-examples)
    - [Example 1: Binary Search in a Sorted Array](#example-1-binary-search-in-a-sorted-array)
    - [Example 2: Binary Search in a List of Strings](#example-2-binary-search-in-a-list-of-strings)
    - [Example 3: Binary Search Using Recursion](#example-3-binary-search-using-recursion)
6. [Summary](#summary)

## Introduction

Binary search is an efficient search algorithm that finds the position of a target value within a sorted array. Binary search compares the target value to the middle element of the array. If they are not equal, the half in which the target cannot lie is eliminated, and the search continues on the remaining half until it is successful or the remaining half is empty.

## Key Concepts

1. **Definition**: Binary search operates on a sorted collection by repeatedly dividing the search interval in half.
2. **Time Complexity**: 
   - **Best Case**: \(O(1)\) - when the middle element is the target.
   - **Average Case**: \(O(\log n)\) - where \(n\) is the number of elements in the array.
   - **Worst Case**: \(O(\log n)\) - in all cases as each step reduces the search space by half.
3. **Space Complexity**: 
   - **Iterative Version**: \(O(1)\) - uses a constant amount of additional space.
   - **Recursive Version**: \(O(\log n)\) - due to the recursion stack.
4. **Applicability**: Requires the collection to be sorted. Commonly used for searching in arrays and lists.

## How It Works

1. Initialize two pointers: `low` at the beginning of the array and `high` at the end.
2. Find the middle element of the array.
3. Compare the middle element with the target:
   - If it matches, return the index.
   - If the target is less than the middle element, repeat the search on the left subarray.
   - If the target is greater than the middle element, repeat the search on the right subarray.
4. Repeat steps 2-3 until the target is found or the search space is empty.

## Pros and Cons

**Pros:**
- Much faster than linear search for large datasets.
- Time complexity is logarithmic, making it highly efficient.

**Cons:**
- Requires the collection to be sorted.
- More complex to implement compared to linear search.

## Java Examples

### Example 1: Binary Search in a Sorted Array

```java
public class BinarySearch {
    public static int binarySearch(int[] arr, int target) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // Return the index of the target element
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;
        int result = binarySearch(numbers, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
```
#### Output :
```markdown
Element found at index: 2
```

### Example 2: Binary Search in a List of Strings
```java
import java.util.Collections;
import java.util.List;

public class BinarySearchStrings {
    public static int binarySearch(List<String> list, String target) {
        int low = 0;
        int high = list.size() - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;
            int comparison = list.get(mid).compareTo(target);

            if (comparison == 0) {
                return mid; // Return the index of the target element
            } else if (comparison < 0) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Cherry", "Date", "Fig");
        Collections.sort(fruits); // Ensure the list is sorted
        String target = "Date";
        int result = binarySearch(fruits, target);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
```
#### Output :
```markdown
Element found at index: 3
```

### Example 3: Binary Search Using Recursion
```java
public class RecursiveBinarySearch {
    public static int binarySearch(int[] arr, int target, int low, int high) {
        if (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == target) {
                return mid; // Return the index of the target element
            } else if (arr[mid] < target) {
                return binarySearch(arr, target, mid + 1, high);
            } else {
                return binarySearch(arr, target, low, mid - 1);
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 40;
        int result = binarySearch(numbers, target, 0, numbers.length - 1);

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
```

#### Output :
``` markdown
Element found at index: 3
```

## Summary
Binary search is a highly efficient algorithm for finding elements in a sorted collection. It significantly reduces the search space with each step, offering logarithmic time complexity. Although it requires the collection to be sorted, its speed and efficiency make it a valuable tool for large datasets.
