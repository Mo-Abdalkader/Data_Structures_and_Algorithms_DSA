# Quick Sort Algorithm

## Introduction

Quick Sort is a highly efficient and widely used comparison-based sorting algorithm. It is an in-place, unstable, and adaptive sorting algorithm known for its divide-and-conquer approach. Quick Sort is particularly useful for large datasets due to its average-case time complexity of \(O(n \log n)\).

## How It Works

Quick Sort operates by selecting a 'pivot' element from the array and partitioning the other elements into two sub-arrays, according to whether they are less than or greater than the pivot. The sub-arrays are then sorted recursively. This process is repeated until the base case of an empty or single-element array is reached, at which point the array is fully sorted.

### Steps

1. **Choose a pivot**: Select a pivot element from the array.
2. **Partitioning**: Rearrange the elements such that all elements less than the pivot are on its left, and all elements greater than the pivot are on its right.
3. **Recursively apply**: Apply the same process to the left and right sub-arrays.
4. **Combine**: The array is sorted once the left and right sub-arrays are sorted.

### Example

Consider the array `[1, 5, 2, 6, 4, 3]` to be sorted in ascending order.

1. Initial array: `[1, 5, 2, 6, 4, 3]`
   - Choose pivot: `3`
   - Partition: `[1, 2]` (less than 3), `3` (pivot), `[5, 6, 4]` (greater than 3)

2. Recursively sort the left sub-array `[1, 2]`:
   - Pivot: `2`
   - Partition: `[1]` (less than 2), `2` (pivot), `[]` (greater than 2)
   - Result: `[1, 2]`

3. Recursively sort the right sub-array `[5, 6, 4]`:
   - Pivot: `4`
   - Partition: `[]` (less than 4), `4` (pivot), `[5, 6]` (greater than 4)
   - Sort `[5, 6]`: Pivot: `5`, Partition: `[]` (less than 5), `5` (pivot), `[6]` (greater than 5)
   - Result: `[5, 6]`

4. Combine results:
   - Sorted array: `[1, 2, 3, 4, 5, 6]`

## Java Code Example

```java
import java.util.ArrayList;
import java.util.Arrays;

public class QuickSort {

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);  // Before pi
            quickSort(arr, pi + 1, high); // After pi
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); // Index of smaller element
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 5, 2, 6, 4, 3};

        System.out.println("Array --------> " + Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println("Sorted Array -> " + Arrays.toString(arr));
    }
}
```
### Output 
```markdown
Array --------> [1, 5, 2, 6, 4, 3]
Sorted Array -> [1, 2, 3, 4, 5, 6]
```

## Time Complexity

- **Best Case**: \(O(nlogn)\)
- **Average Case**: \(O(nlogn)\)
- **Worst Case**: \(O(n^2)\) (when the smallest or largest element is always chosen as the pivot)

Quick Sort's performance is heavily dependent on the choice of the pivot. Various strategies, such as choosing a random pivot or using the median-of-three rule, can help mitigate the risk of worst-case scenarios.

## Space Complexity

Quick Sort is an in-place sorting algorithm, but it requires 𝑂(log𝑛) auxiliary space for the recursive function calls.

## Characteristics

- **In-place**: Yes
- **Stable**: No (can be made stable with modifications)
- **Adaptive**: No

## Use Cases

Quick Sort is suitable for large datasets and is often the go-to choice for general-purpose sorting due to its efficiency and average-case performance. It is widely used in various libraries and applications.

## Conclusion

Quick Sort is a powerful and efficient sorting algorithm that, with proper pivot selection, can outperform many other sorting algorithms for large datasets. Its divide-and-conquer approach and in-place sorting capabilities make it a valuable tool for various sorting needs.
