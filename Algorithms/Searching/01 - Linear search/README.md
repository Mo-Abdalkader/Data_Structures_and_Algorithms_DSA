# Linear Search: A Comprehensive Guide

## Table of Contents
1. [Introduction](#introduction)
2. [Key Concepts](#key-concepts)
3. [How It Works](#how-it-works)
4. [Pros and Cons](#pros-and-cons)
5. [Java Examples](#java-examples)
    - [Example 1: Linear Search in an Array](#example-1-linear-search-in-an-array)
    - [Example 2: Linear Search in a List of Strings](#example-2-linear-search-in-a-list-of-strings)
    - [Example 3: Linear Search in a Linked List](#example-3-linear-search-in-a-linked-list)
6. [Summary](#summary)

## Introduction

Linear search, also known as sequential search, is one of the simplest search algorithms. It works by checking each element of a list sequentially until the desired element is found or the list ends.

## Key Concepts

1. **Definition**: Linear search scans each element in a collection one by one until it finds the target value or reaches the end of the collection.
2. **Time Complexity**: 
   - **Best Case**: \(O(1)\) - when the target element is the first element.
   - **Average Case**: \(O(n)\) - where \(n\) is the number of elements in the list.
   - **Worst Case**: \(O(n)\) - when the target element is the last element or not present.
3. **Space Complexity**: \(O(1)\) - requires a constant amount of additional space.
4. **Applicability**: Can be used on any data structure that allows sequential access (arrays, linked lists, etc.).

## How It Works

1. Start from the first element.
2. Compare the current element with the target.
3. If the current element matches the target, return its index.
4. If the current element does not match the target, move to the next element.
5. Repeat steps 2-4 until the element is found or the end of the list is reached.

## Pros and Cons

**Pros:**
- Simple to implement.
- Does not require the collection to be sorted.
- Works well with small datasets.

**Cons:**
- Inefficient for large datasets.
- Time complexity is linear, which can be slow compared to more advanced algorithms like binary search.

## Java Examples

### Example 1: Linear Search in an Array

```java
public class LinearSearch {
    public static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // Return the index of the target element
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        int target = 30;
        int result = linearSearch(numbers, target);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
```

### Example 2: Linear Search in a List of Strings
```java
import java.util.List;

public class LinearSearchStrings {
    public static int linearSearch(List<String> list, String target) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(target)) {
                return i; // Return the index of the target element
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Banana", "Cherry", "Date", "Fig");
        String target = "Cherry";
        int result = linearSearch(fruits, target);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
```
### Example 3: Linear Search in a Linked List
```java
import java.util.LinkedList;

public class LinearSearchLinkedList {
    public static int linearSearch(LinkedList<Integer> list, int target) {
        int index = 0;
        for (int element : list) {
            if (element == target) {
                return index; // Return the index of the target element
            }
            index++;
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(300);
        numbers.add(400);
        numbers.add(500);

        int target = 300;
        int result = linearSearch(numbers, target);
        
        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found");
        }
    }
}
```

## Summary
Linear search is a straightforward and easy-to-understand algorithm that is useful for small datasets and unsorted collections. While it may not be the most efficient for larger datasets, its simplicity makes it a good starting point for learning search algorithms.
