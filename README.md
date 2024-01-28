# Data Structures


>[!important]
>### Definition
>A data structure is a way of organizing and storing data in a computer's memory so that it can be used efficiently.
>
>### Purpose
>Data structures are used to manage and organize data in a way that supports various operations, such as insertion, deletion, and retrieval.


## Types of Data Structures:

- **Primitive Data Structures:** Basic data types like integers, floating-point numbers, characters, etc.
- **Linear Data Structures:** Elements are arranged in a linear sequence, e.g., arrays, linked lists, stacks, and queues.
- **Non-linear Data Structures:** Elements are not arranged in a sequential manner, e.g., trees and graphs.
- **Homogeneous Data Structures:** All elements are of the same type, e.g., arrays.
- **Heterogeneous Data Structures:** Elements can be of different types, e.g., structures and objects.

## Operations on Data Structures:

- **Traversal:** Accessing and processing each element in a data structure.
- **Search:** Finding the location of a particular element.
- **Insertion:** Adding a new element to the data structure.
- **Deletion:** Removing an element from the data structure.
- **Sorting:** Arranging elements in a specific order.
- **Merging:** Combining two or more data structures into one.

## Simple Data Structures:

- **Arrays:** Basic collection of elements in contiguous memory.
- **Linked Lists:** Elements connected by pointers in a linear structure.
- **Stacks:** Last In, First Out (LIFO) data structure.
- **Queues:** First In, First Out (FIFO) data structure.
- **Sets:** Collection of distinct elements with no specific order.
- **Hash Maps:** Mapping keys to values using a hash function.

## Intermediate Data Structures:

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

## Complex Data Structures:

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


***

# Algorithm:
An algorithm is a step-by-step procedure or a set of rules for solving a specific problem or accomplishing a particular task. In the context of computer science and programming, an algorithm is a well-defined, finite sequence of instructions that, when executed, produces the desired output for a given set of inputs. Algorithms are essential in computer science as they provide a systematic approach to problem-solving.

Key characteristics of algorithms include:

**Input:** Algorithms take input, which is processed to produce an output.
**Definiteness:** Each step of the algorithm must be precisely and unambiguously defined.
**Finiteness:** Algorithms must terminate after a finite number of steps.
**Effectiveness:** Every operation in the algorithm must be simple and well-defined, so that it can be executed by a human or a machine.
**Correctness:** The algorithm should produce the correct output for all valid inputs.

>[!Note]
>Algorithms are used to solve a wide range of problems, from sorting a list of numbers to searching for information on the internet.

## Big O Notation:
Big O notation is a mathematical notation that describes the upper bound on the growth rate of an algorithm's time complexity or space complexity. It provides a way to express the performance or efficiency of an algorithm in terms of its input size. The notation is particularly useful for comparing algorithms and understanding how they scale as the input size increases.

In Big O notation, we express the time complexity or space complexity of an algorithm using a function that describes its worst-case behavior. The letter "O" stands for "order of," and it is followed by a function that characterizes the upper bound.

Examples of Common Big O Notations:
```markdown
`O(1)` - Constant Time:
The algorithm's performance does not depend on the input size; it takes a constant amount of time.

`O(log n)` - Logarithmic Time:
The algorithm's performance grows logarithmically with the input size.

`O(n)` - Linear Time:
The performance of the algorithm is directly proportional to the input size.

`O(n log n)` - Linearithmic Time:
Common for efficient sorting algorithms like merge sort and heap sort.

`O(n^2)` - Quadratic Time:
The performance of the algorithm is proportional to the square of the input size.

`O(2^n)` - Exponential Time:
The performance grows exponentially with the input size.
```

>[!Tip]
>Understanding Big O notation allows programmers and computer scientists to make informed decisions about the efficiency of different algorithms and choose the most appropriate one for a given problem based on the expected size of the input.
>It's a valuable tool for algorithm analysis and optimization.
