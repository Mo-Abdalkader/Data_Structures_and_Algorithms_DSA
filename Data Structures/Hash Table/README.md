# Hash Table Data Structure

A **hash table** is a data structure that implements an associative array, a structure that can map keys to values. It uses a hash function to compute an index, also called a hash code, into an array of buckets or slots, from which the desired value can be found.

## Example
Consider a hash table used to store information about students' grades in a class:

```python
students_grades = {
    "Alice": "A",
    "Bob": "B",
    "Charlie": "C",
    "David": "A"
}
```
---

## Functionalities

### Insertion:

- **Insert a Key-Value Pair**: Adds a key-value pair to the hash table. If the key already exists, the value is updated.

### Deletion:

- **Delete a Key-Value Pair**: Removes the key and its associated value from the hash table.

### Lookup:

- **Find a Value by Key**: Retrieves the value associated with a given key.

### Collision Handling:

- **Separate Chaining**: Uses a linked list at each index to handle collisions by storing multiple elements.
- **Open Addressing**: Probes alternative positions in the array when a collision occurs.

### Resizing:

- **Dynamic Resizing**: Hash tables can be resized when the load factor exceeds a certain threshold to maintain efficiency.

## Time and Space Complexity

### Insertion:

- **Best Case**: O(1) - Constant time complexity when there is no collision.
- **Worst Case**: O(n) - Linear time complexity in the case of many collisions (depends on collision resolution strategy).

### Deletion:

- **Best Case**: O(1) - Constant time complexity when there is no collision.
- **Worst Case**: O(n) - Linear time complexity in the case of many collisions.

### Lookup:

- **Best Case**: O(1) - Constant time complexity when the element is directly accessible.
- **Worst Case**: O(n) - Linear time complexity in the case of many collisions.

### Space Complexity:

- **Space Complexity**: O(n) - Linear space complexity, where `n` is the number of elements stored.

## Collision Handling Strategies

### Separate Chaining:

- **Method**: Each bucket is a linked list. Collisions are handled by appending the element to the list at the hashed index.
- **Time Complexity**: 
  - **Best Case**: O(1) - Element is found directly.
  - **Worst Case**: O(n) - All elements are in the same bucket.
- **Memory Usage**: Requires additional memory for linked lists.

### Open Addressing:

- **Method**: Collisions are handled by probing the array to find an empty slot.
  - **Linear Probing**: Sequentially checks the next slots until an empty one is found.
  - **Quadratic Probing**: Uses a quadratic function to determine the next slot.
  - **Double Hashing**: Uses a second hash function to find the next slot.
- **Time Complexity**:
  - **Best Case**: O(1) - Slot found immediately.
  - **Worst Case**: O(n) - Array might need to be fully traversed.
- **Memory Usage**: Does not require extra memory for linked lists, but may have higher memory overhead due to probing.

## Additional Considerations

- **Load Factor**: Measures how full the hash table is. A high load factor increases the chances of collisions and may trigger resizing.
- **Resizing**: When the hash table is resized (typically doubled in size), all elements must be rehashed, which is an expensive operation but necessary for maintaining performance.
- **Hash Function Quality**: A good hash function evenly distributes elements across the array to minimize collisions.

## Usage

- **Applications**: Hash tables are widely used in databases, caches, associative arrays, and for implementing sets.
- **Languages and Libraries**: Most modern programming languages provide built-in hash table implementations, such as Python's dictionaries or Java's HashMap.

## Comparison of Collision Handling Methods

| Feature                  | Separate Chaining                                       | Open Addressing                                    |
|--------------------------|--------------------------------------------------------|---------------------------------------------------|
| Memory Usage             | Higher due to linked list storage at each bucket.      | Lower as all data is stored within the hash table. |
| Lookup Complexity        | O(1) on average, O(n) in the worst case.                | O(1) on average, O(n) in the worst case.          |
| Collision Resolution     | Handles collisions with linked lists.                   | Handles collisions by probing the table for the next available slot. |
| Memory Overhead          | Higher, as each bucket requires extra memory for the linked list nodes. | Lower, as it only requires memory for the elements themselves. |
| Implementation Complexity | Simpler to implement and understand.                    | More complex due to probing and potential clustering. |
| Performance Degradation  | Can degrade if many collisions occur, leading to long linked lists. | Can degrade due to clustering, where multiple elements hash to the same area. |
| Usage                    | Suitable for scenarios where memory is not a concern and simplicity is preferred. | Useful when memory is limited and minimizing overhead is important. |
