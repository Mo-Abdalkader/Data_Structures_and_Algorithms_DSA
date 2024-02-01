package datastructure;

/**
 *
 * @author Mohamed Abdalkader
 */
public class ArrayBasedStack<T> {

    private int top;
    private int DEFAULT_SIZE = 10;
    private Object[] items;

    public ArrayBasedStack() {
        top = -1;
        items = new Object[DEFAULT_SIZE];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void clear() {
        top = -1;
        items = new Object[DEFAULT_SIZE];
    }

    public int size() {
        return top + 1;
    }

    public T pop() {
        if (!isEmpty()) { // To avoid errors, if the stack is already empty
            T itemToPop = (T) items[top]; // Get the top element to be returned
            items[top] = null; // Remove this element
            top--;
            return itemToPop; // Return the element I saved before
        }
        return null;
    }

    public void enlarge() {
        Object[] new_array = new Object[items.length * 2];
        System.arraycopy(items, 0, new_array, 0, items.length);
        items = new_array;
    }

    public void push(T item) {
        if (top == items.length - 1) { // If the Stack is full, Enlarging the stack is needed
            enlarge();
        }
        items[++top] = item;
    }

    public T peek() {
        return (T) items[top];
    }

    public void display() {
        for (int i = 0; i <= top; i++) {
            System.out.println(items[i]);
        }
    }

    public static void main(String[] args) {
        ArrayBasedStack<Integer> stack = new ArrayBasedStack<>();
        stack.push(1);                 // Stack = [1]
        stack.push(2);                 // Stack = [1, 2]
        stack.push(3);                 // Stack = [1, 2, 3]
        System.out.println(stack.pop());  // Stack = [1, 2], Output = 3 
        stack.push(4);                 // Stack = [1, 2, 4]
        System.out.println(stack.size()); // 3
        System.out.println(stack.peek()); // 4
    }
}
