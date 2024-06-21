# Selection Sort Algorithm

## Introduction

Selection Sort is a simple comparison-based sorting algorithm. It is an in-place, unstable, and not adaptive sorting algorithm. Selection Sort is known for its simplicity and is useful for small datasets or when memory write operations are costly.

## How It Works

Selection Sort divides the input list into two parts: the sorted part at the left end and the unsorted part at the right end. Initially, the sorted part is empty, and the unsorted part contains the entire list. The algorithm proceeds by finding the smallest (or largest, depending on sorting order) element from the unsorted part and removing it, then appending it to the sorted part. This process is repeated until the unsorted part is empty and the sorted part contains all elements.

### Steps

1. **Initialize**: Start with the first element as the minimum.
2. **Find the minimum**: Traverse the unsorted part of the list to find the minimum element.
3. **Remove and append**: Remove the minimum element from the unsorted part and append it to the sorted part.
4. **Repeat**: Repeat the process until the entire list is sorted.

### Example

Consider the array `[1, 5, 2, 6, 4, 3]` to be sorted in ascending order.

1. Initial array: `[1, 5, 2, 6, 4, 3]`
   - The smallest element is `1`. Append `1` to the sorted array.
   - Array after first pass: `[5, 2, 6, 4, 3]` (unsorted part), `[1]` (sorted part)

2. Second pass:
   - The smallest element is `2`. Append `2` to the sorted array.
   - Array after second pass: `[5, 6, 4, 3]` (unsorted part), `[1, 2]` (sorted part)

3. Third pass:
   - The smallest element is `3`. Append `3` to the sorted array.
   - Array after third pass: `[5, 6, 4]` (unsorted part), `[1, 2, 3]` (sorted part)

4. Fourth pass:
   - The smallest element is `4`. Append `4` to the sorted array.
   - Array after fourth pass: `[5, 6]` (unsorted part), `[1, 2, 3, 4]` (sorted part)

5. Fifth pass:
   - The smallest element is `5`. Append `5` to the sorted array.
   - Array after fifth pass: `[6]` (unsorted part), `[1, 2, 3, 4, 5]` (sorted part)

6. Sixth pass:
   - The smallest element is `6`. Append `6` to the sorted array.
   - Array after sixth pass: `[]` (unsorted part), `[1, 2, 3, 4, 5, 6]` (sorted part)

The array is now sorted.

## Java Code Example

```java
import java.util.ArrayList;

public class SelectionSort {

    public static int findSmallest(ArrayList<Integer> arr) {
        int smallestElement = arr.get(0);
        int smallestIndex = 0;
        for (int index = 0; index < arr.size(); index++) {
            if (arr.get(index) < smallestElement) {
                smallestElement = arr.get(index);
                smallestIndex = index;
            }
        }
        return smallestIndex;
    }

    public static ArrayList<Integer> selectionSort(ArrayList<Integer> arr) {
        ArrayList<Integer> sortedArr = new ArrayList<>();
        ArrayList<Integer> copyArr = new ArrayList<>(arr);  // Create local copy of the array to avoid 'popping' elements from the original array while sorting
        while (!copyArr.isEmpty()) {
            int smallestIndex = findSmallest(copyArr);
            sortedArr.add(copyArr.remove(smallestIndex));
        }
        return sortedArr;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(5);
        arr.add(2);
        arr.add(6);
        arr.add(4);
        arr.add(3);

        ArrayList<Integer> sortedArr = selectionSort(arr);

        System.out.println("Array --------> " + arr);
        System.out.println("Sorted Array -> " + sortedArr);
    }
}
```
## Time Complexity

- **Best Case**: \(O(n^2)\)
- **Average Case**: \(O(n^2)\)
- **Worst Case**: \(O(n^2)\)

Selection Sort performs the same number of comparisons regardless of the initial order of the array. Therefore, its time complexity is \(O(n^2)\) in all cases.

## Space Complexity

Selection Sort is an in-place sorting algorithm. It does not require any extra storage and has a space complexity of \(O(1)\).

## Characteristics

- **In-place**: Yes
- **Stable**: No
- **Adaptive**: No

## Use Cases

Selection Sort is not suitable for large datasets due to its quadratic time complexity. However, it can be useful when:

- The dataset is small.
- Memory write operations are costly and need to be minimized.
- Simplicity is more important than performance.

## Conclusion

Selection Sort is a straightforward sorting algorithm that can be useful in certain situations. Its ease of implementation and understanding makes it a good educational tool for learning about sorting algorithms and their properties.
