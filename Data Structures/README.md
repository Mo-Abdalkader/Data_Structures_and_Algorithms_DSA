# Data Structures

>[!important]
>### Definition
>A data structure is a way of organizing and storing data in a computer's memory so that it can be used efficiently.
>
>### Purpose
>Data structures are used to manage and organize data in a way that supports various operations, such as insertion, deletion, and retrieval.

## Key Concepts

1. **Definition**: A data structure is a way to store and organize data to facilitate access and modifications.
2. **Types**: Data structures can be broadly classified into:
   - **Primitive Data Structures**: Basic structures directly operated upon by machine instructions (e.g., integers, floats, characters).
   - **Non-Primitive Data Structures**: More complex structures built from primitive data types (e.g., arrays, linked lists, stacks, queues, trees, graphs).

## Types of Data Structures

- **Primitive Data Structures:** Basic data types like integers, floating-point numbers, characters, etc.
- **Linear Data Structures:** Elements are arranged in a linear sequence, e.g., arrays, linked lists, stacks, and queues.
- **Non-linear Data Structures:** Elements are not arranged in a sequential manner, e.g., trees and graphs.
- **Homogeneous Data Structures:** All elements are of the same type, e.g., arrays.
- **Heterogeneous Data Structures:** Elements can be of different types, e.g., structures and objects.

## Operations on Data Structures

- **Traversal:** Accessing and processing each element in a data structure.
- **Search:** Finding the location of a particular element.
- **Insertion:** Adding a new element to the data structure.
- **Deletion:** Removing an element from the data structure.
- **Sorting:** Arranging elements in a specific order.
- **Merging:** Combining two or more data structures into one.

## Simple Data Structures

- **Arrays:** Basic collection of elements in contiguous memory.
- **Linked Lists:** Elements connected by pointers in a linear structure.
- **Stacks:** Last In, First Out (LIFO) data structure.
- **Queues:** First In, First Out (FIFO) data structure.
- **Sets:** Collection of distinct elements with no specific order.
- **Hash Maps:** Mapping keys to values using a hash function.

## Intermediate Data Structures

- **Trees:**
  - **Binary Tree:** Hierarchical structure with nodes having at most two children.
  - **Binary Search Tree (BST):** Ordered binary tree for efficient search.
  - **AVL Tree:** Self-balancing binary search tree.
- **Graphs:**
  - **Directed Graph and Undirected Graph:** Collections of vertices and edges.
  - **Graph Adjacency Matrix and Adjacency List:** Representations of graphs.
- **Heaps:**
  - **Min Heap and Max Heap:** Binary heaps with specific ordering properties.
- **Trie:** Tree structure for storing dynamic sets or associative arrays.
- **Disjoint Set (Union-Find):** Data structure for partitioning elements into disjoint subsets.

## Complex Data Structures

- **Hash Tables:** Efficient data structure for key-value mapping.
- **B-trees and B+ Trees:** Self-balancing trees used in databases and file systems.
- **Skip List:** Structure allowing quick search, insertion, and deletion in a sorted sequence.
- **Priority Queue:** Abstract data type with constant-time access to the highest (or lowest) priority element.
- **Sparse Matrix:** Data structure for representing matrices with mostly zero elements.
- **Quadtree and Octree:** Trees partitioning space in two and three dimensions, respectively.
- **Self-Balancing Trees:**
  - **Red-Black Tree:** Self-balancing binary search tree.
  - **Splay Tree:** Binary search tree with a restructuring property.
- **Cuckoo Hashing:** Hash table algorithm resolving collisions using multiple hash functions.

## Time and Space Complexity

- **Time Complexity:** Measures the amount of time an algorithm takes to complete as a function of the length of the input.
  - **Best Case:** The minimum time an algorithm takes to complete.
  - **Average Case:** The average time an algorithm takes to complete.
  - **Worst Case:** The maximum time an algorithm takes to complete.
- **Space Complexity:** Measures the amount of memory space an algorithm uses in relation to the input size.

## Common Use Cases

- **Arrays:** Used for static collections of data where index-based access is needed.
- **Linked Lists:** Used for dynamic collections of data where frequent insertions and deletions occur.
- **Stacks:** Used for backtracking algorithms (e.g., recursive function calls, undo operations).
- **Queues:** Used for scheduling and order processing (e.g., print jobs, task scheduling).
- **Trees:** Used for hierarchical data representation (e.g., file systems, organizational structures).
- **Graphs:** Used for network representations (e.g., social networks, transportation networks).

## Summary

Understanding data structures is crucial for efficient algorithm design and problem-solving in computer science. Choosing the right data structure depends on the specific needs of the task, including how data will be accessed, modified, and stored. Mastery of data structures leads to improved performance and optimized resource utilization in software applications.
