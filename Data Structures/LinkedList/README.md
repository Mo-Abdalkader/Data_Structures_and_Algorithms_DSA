# Linked List Data Structure

A linked list is a linear data structure where elements, called nodes, are stored in a sequence. Each node contains a data element and a reference (or pointer) to the next node in the sequence.

## Types of Linked Lists

1. **Singly Linked List**: Each node has a reference to the next node.
2. **Doubly Linked List**: Each node has references to both the next and previous nodes.
3. **Circular Linked List**: The last node points back to the first node, forming a circle.

## Functionalities

### Insertion:

- **Insert at the Beginning**: Adds an element to the beginning of the list.
- **Insert at the End**: Adds an element to the end of the list.
- **Insert at a Specific Position**: Inserts an element at a given position in the list.

### Deletion:

- **Delete from the Beginning**: Removes the first element from the list.
- **Delete from the End**: Removes the last element from the list.
- **Delete at a Specific Position**: Removes an element from a given position in the list.

### Traversal:

- Iterates through each node in the list.

### Searching:

- Finds a specific element in the list.

### Size:

- Returns the number of elements in the list.

### isEmpty:

- Checks if the list is empty.

## Time and Space Complexity

### Insertion:

- **Insert at the Beginning**: O(1) - Constant time complexity.
- **Insert at the End**: O(n) - Linear time complexity (when the tail pointer is not maintained), O(1) if the tail pointer is maintained.
- **Insert at a Specific Position**: O(n) - Linear time complexity.

### Deletion:

- **Delete from the Beginning**: O(1) - Constant time complexity.
- **Delete from the End**: O(n) - Linear time complexity (when the tail pointer is not maintained), O(1) if the tail pointer is maintained.
- **Delete at a Specific Position**: O(n) - Linear time complexity.

### Traversal:

- O(n) - Linear time complexity.

### Searching:

- O(n) - Linear time complexity.

### Space Complexity:

- O(n) - Linear space complexity, as memory is dynamically allocated for each node.

## Additional Considerations

- **Dynamic Size**: Linked lists can grow or shrink dynamically during execution.
- **Memory Overhead**: Each node requires extra memory for storing pointers/references.
- **Random Access**: Limited random access. Accessing elements requires sequential traversal.
- **Applications**: Useful when frequent insertions and deletions are required. Often used in implementations of stacks, queues, and hash tables.
- **Languages and Libraries**: Many programming languages have built-in support for linked lists. Standard libraries may provide linked list implementations.

| Feature                  | Singly Linked List                                        | Doubly Linked List                                    | Circular Linked List                                    |
|--------------------------|------------------------------------------------------------|-------------------------------------------------------|--------------------------------------------------------|
| Memory Usage             | Requires less memory per node as it only contains a reference to the next node. | Requires more memory per node as it contains references to both the next and previous nodes. | Similar memory usage to singly linked list. May have slightly higher overhead due to circular referencing. |
| Traversal                | Traversal is only possible in the forward direction.      | Supports bidirectional traversal (forward and backward). | Traversal is possible in both directions due to its circular structure. |
| Insertion and Deletion   | Efficient insertion and deletion at the beginning of the list (O(1)). Insertion and deletion at other positions require traversal, leading to linear time complexity (O(n)). | Supports efficient insertion and deletion at both the beginning and end of the list (O(1)). Insertion and deletion at other positions also require traversal but are slightly more efficient than in singly linked list. | Similar insertion and deletion complexities as singly linked list. Insertion and deletion at the end of the list are more efficient due to its circular structure. |
| Memory Overhead          | Low memory overhead, as it only requires one reference per node. | Higher memory overhead compared to singly linked list due to the additional reference to the previous node. | Similar memory overhead to singly linked list. May have slightly higher overhead due to circular referencing. |
| Implementation Complexity | Simple to implement and manage.                            | More complex to implement due to bidirectional references. | Similar complexity to singly linked list but may require additional handling for circular referencing. |
| Usage                    | Suitable for scenarios where forward traversal is sufficient and memory usage needs to be minimized. | Useful when bidirectional traversal is required or when efficient insertion and deletion at both ends of the list are needed. | Useful when circular traversal is desired or when the list needs to be iterated infinitely without a definite end. |

