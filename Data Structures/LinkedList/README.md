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
