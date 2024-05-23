# Queue Data Structure

A queue is a fundamental data structure in computer science that follows the First In, First Out (FIFO) principle. This means that the first element added to the queue is the first one to be removed. Imagine a line of people waiting for their turn at a service counter; the first person in line is the first to be served. The operations on a queue are typically performed at both ends, with elements added at the rear (end) and removed from the front (beginning).

## Functionalities

1. **Enqueue:** Adds an element to the rear of the queue.
2. **Dequeue:** Removes the element from the front of the queue.
3. **Front or Peek:** Returns the element at the front of the queue without removing it.
4. **IsEmpty:** Checks if the queue is empty.
5. **Size:** Returns the number of elements in the queue.

## Time and Space Complexity

1. **Enqueue:** \(O(1)\) - Constant time complexity. The enqueue operation involves adding an element to the rear of the queue, and this operation takes the same amount of time, regardless of the size of the queue.

2. **Dequeue:** \(O(1)\) - Constant time complexity. The dequeue operation involves removing the element from the front of the queue, and like enqueue, it takes constant time.

3. **Front or Peek:** \(O(1)\) - Constant time complexity. Accessing the element at the front of the queue is a simple operation that takes constant time.

4. **IsEmpty:** \(O(1)\) - Constant time complexity. Checking if the queue is empty involves a simple comparison.

5. **Size:** \(O(1)\) - Constant time complexity. Maintaining a count of elements allows the size operation to take constant time.

## Additional Considerations

1. **Applications:**
   - **Order Processing:** Queues are used to manage tasks that need to be processed in the order they were received, such as printing documents or managing tasks in operating systems.
   - **Breadth-First Search (BFS):** In graph algorithms, queues are used to traverse nodes level by level.
   - **Scheduling:** Queues are used in scheduling processes in operating systems to manage tasks.

2. **Dynamic Arrays vs. Linked Lists:**
   - Queues can be implemented using dynamic arrays or linked lists. Dynamic arrays are more space-efficient, but their size may need to be resized, leading to occasional \(O(n)\) time complexity for enqueue operation. Linked lists avoid resizing, but each element requires additional memory for the link.

3. **Circular Queue:**
   - A circular queue is a linear data structure that uses a single, fixed-size buffer as if it were connected end-to-end. This avoids the issue of wasted space in a regular queue.

4. **Double-Ended Queue (Deque):**
   - A deque allows insertion and deletion at both ends, providing greater flexibility in certain applications.

5. **Overflow and Underflow:**
   - **Overflow:** Occurs when trying to enqueue an element into a full queue.
   - **Underflow:** Occurs when trying to dequeue or peek from an empty queue.

6. **Limitations:**
   - Queues have limited random access. You can only directly access the front and rear elements.
   - For applications requiring access to arbitrary elements, other data structures like arrays may be more suitable.

7. **Languages and Libraries:**
   - Many programming languages have built-in support for queues. For example, in Java, you can use the `LinkedList` or `ArrayDeque` classes from the `java.util` package. Similarly, many standard libraries provide queue implementations.

8. **Priority Queue:**
   - A priority queue is a type of queue where elements are removed based on priority rather than order of insertion. This is typically implemented using a heap.

## Java Examples

### Example 1: Basic Queue Operations

```java
import java.util.LinkedList;
import java.util.Queue;

public class BasicQueue {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        // Enqueue elements
        queue.add(10);
        queue.add(20);
        queue.add(30);

        // Dequeue element
        int removed = queue.remove();
        System.out.println("Removed element: " + removed);

        // Peek element
        int front = queue.peek();
        System.out.println("Front element: " + front);

        // Check if queue is empty
        boolean isEmpty = queue.isEmpty();
        System.out.println("Is the queue empty? " + isEmpty);

        // Get the size of the queue
        int size = queue.size();
        System.out.println("Size of the queue: " + size);
    }
}
```
#### Output :
```markdown
Removed element: 10
Front element: 20
Is the queue empty? false
Size of the queue: 2
```

### Example 2: Circular Queue Implementation
```java
public class CircularQueue {
    private int[] queue;
    private int front;
    private int rear;
    private int size;

    public CircularQueue(int capacity) {
        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
    }

    public boolean isFull() {
        return size == queue.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void enqueue(int element) {
        if (isFull()) {
            throw new IllegalStateException("Queue is full");
        }
        rear = (rear + 1) % queue.length;
        queue[rear] = element;
        size++;
    }

    public int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        int element = queue[front];
        front = (front + 1) % queue.length;
        size--;
        return element;
    }

    public int peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }
        return queue[front];
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front element: " + queue.peek());
        System.out.println("Queue size: " + queue.size());

        queue.enqueue(40);
        queue.enqueue(50);
        queue.enqueue(60);

        while (!queue.isEmpty()) {
            System.out.println("Dequeued: " + queue.dequeue());
        }
    }
}
```

#### Output :
```markdown
Dequeued: 10
Front element: 20
Queue size: 2
Dequeued: 20
Dequeued: 30
Dequeued: 40
Dequeued: 50
Dequeued: 60
```

## Summary
A queue is a versatile data structure used in various applications where elements need to be processed in the order they were added. Understanding how to implement and use queues, including circular and priority queues, is essential for efficient programming and algorithm design. While queues offer many advantages, their limitation of sequential access should be considered when choosing the appropriate data structure for a specific use case.
