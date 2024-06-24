## Recursion

**Recursion** is a programming technique where a function calls itself directly or indirectly to solve a problem. It involves breaking down a problem into smaller, simpler subproblems, and solving each of these subproblems recursively until they reach a base case (a condition where the recursion stops).

**Key points about recursion:**
1. **Function Calls Itself:** A recursive function calls itself either directly or indirectly.
2. **Memory Usage:** Each recursive call adds a new frame to the call stack, which stores information about the function call. This can lead to a stack overflow if too many recursive calls are made without reaching the base case.
3. **General Form:** Recursive functions generally consist of two parts: base case(s) that specify when the recursion should terminate, and recursive case(s) that define how to break down the problem into smaller subproblems.

**Example of recursion in Java:**

```java
public class RecursionExample {
    public static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5)); // Output: 120
    }
}
```
In this example, factorial is a recursive function that calculates the factorial of a number n. It calls itself with a smaller argument (n - 1) until it reaches the base case (n == 0).
