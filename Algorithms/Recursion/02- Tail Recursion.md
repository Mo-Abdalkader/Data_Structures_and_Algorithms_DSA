## Tail Recursion

**Tail recursion:** is a special form of recursion where the recursive call is the last thing executed by the function. In other words, the result of the recursive call is returned immediately without further computation. This allows the compiler or interpreter to optimize the memory usage by reusing the same stack frame for each recursive call, effectively making it as efficient as a loop.

**Key points about recursion:**

1. **Last Operation:** The recursive call in a tail-recursive function is the last operation performed by that function.
2. **Optimization:** Tail recursion can be optimized by compilers or interpreters into an iterative form, eliminating the need for additional stack frames for each recursive call.
3. **Efficiency:** Tail recursion is generally more memory-efficient than non-tail recursion, especially when dealing with deep recursion.


**Example of recursion in Java:**

```java
public class TailRecursionExample {
    public static int factorialTail(int n, int acc) {
        if (n == 0) {
            return acc;
        } else {
            return factorialTail(n - 1, acc * n);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorialTail(5, 1)); // Output: 120
    }
}
```
In this factorialTail function, acc accumulates the factorial value as the function progresses. The recursive call factorialTail(n - 1, acc * n) is a tail call because it's the last operation executed in the function.
