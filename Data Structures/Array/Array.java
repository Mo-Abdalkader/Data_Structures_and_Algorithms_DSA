
import java.util.Arrays;

public class Array {

    private int length;
    private int[] array;
    private static final int DEFAULT_SIZE = 2;

    public Array() {
        this.length = 0;
        this.array = new int[DEFAULT_SIZE];
    }

    private int getSize() {
        return array.length;
    }

    private int getLength() {
        return length;
    }

    private void enlarge(int newSize) {
        int[] newArray = new int[newSize];
        System.arraycopy(array, 0, newArray, 0, length);
        array = newArray;
    }

    private void append(int newItem) {
        if (length == array.length) {
            enlarge(array.length * 2);
        }
        array[length++] = newItem;
    }

    private void insert(int index, int newItem) {
        if (index < 0 || index > length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        if (length == array.length) {
            enlarge(array.length * 2);
        }

        for (int i = length; i > index; i--) {
            array[i] = array[i - 1];
        }

        array[index] = newItem;
        length++;
    }

    private boolean delete(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        for (int i = index; i < length - 1; i++) {
            array[i] = array[i + 1];
        }

        array[--length] = 0;
        return true;
    }

    private int get(int index) {
        if (index < 0 || index >= length) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return array[index];
    }

    private int search(int value) {
        for (int i = 0; i < length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1; // Element not found
    }

    private void clear() {
        length = 0;
        array = new int[DEFAULT_SIZE];
    }

    private boolean isEmpty() {
        return length == 0;
    }

    private void sort() {
        Arrays.sort(array, 0, length);
    }

    private void reverse() {
        int i = 0, j = length - 1;
        while (i < j) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i++;
            j--;
        }
    }

    private int getMin() {
        if (length == 0) {
            throw new IllegalStateException("Array is empty");
        }
        int min = array[0];
        for (int i = 1; i < length; i++) {
            min = Math.min(min, array[i]);
        }
        return min;
    }

    private int getMax() {
        if (length == 0) {
            throw new IllegalStateException("Array is empty");
        }
        int max = array[0];
        for (int i = 1; i < length; i++) {
            max = Math.max(max, array[i]);
        }
        return max;
    }

    private void trimToSize() {
        if (length < array.length) {
            int[] newArray = new int[length];
            System.arraycopy(array, 0, newArray, 0, length);
            array = newArray;
        }
    }

    private void print() {
        System.out.print("[");
        for (int i = 0; i < length; i++) {
            System.out.print(array[i]);

            if (i != length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Array dynamicArray = new Array();
        dynamicArray.append(1);
        dynamicArray.print(); // [1]
        dynamicArray.insert(0, 5);
        dynamicArray.print(); // [5, 1]
        dynamicArray.append(2);
        dynamicArray.print(); // [5, 1, 2]
        dynamicArray.delete(0);
        dynamicArray.print(); // [1, 2]
        dynamicArray.append(3);
        dynamicArray.print(); // [1, 2, 3]
        dynamicArray.insert(0, 0);
        dynamicArray.print(); // [0, 1, 2, 3]
        dynamicArray.append(2);
        dynamicArray.print(); // [0, 1, 2, 3, 2]
        dynamicArray.delete(1);
        dynamicArray.print(); // [0, 2, 3, 2]

        // Additional Functions
        System.out.println("Element at index 1: " + dynamicArray.get(1));  // Element at index 1: 2
        System.out.println("Index of value 2: " + dynamicArray.search(2)); // Index of value 2: 1
        System.out.println("Is the array empty? " + dynamicArray.isEmpty());     // Is the array empty? false

        dynamicArray.sort();
        dynamicArray.print(); // [0, 2, 2, 3]

        dynamicArray.reverse();
        dynamicArray.print(); // [3, 2, 2, 0]

        System.out.println(dynamicArray.getMin()); // 0
        System.out.println(dynamicArray.getMax()); // 3

        dynamicArray.clear();
        dynamicArray.print(); // []
    }
}
