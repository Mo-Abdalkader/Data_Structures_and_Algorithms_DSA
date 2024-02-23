package datastructure;

class Node<T> {

    Node<T> next = null;
    T data = null;

    public Node(T data) {
        this.data = data;
    }
}

public class CircularLinkedList<T> {

    private Node<T> head;
    private int size;

    public CircularLinkedList() {
        head = null;
        size = 0;
    }

    // Method to add a new node at the end of the circular linked list
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            head.next = head; // Point to itself to form a circular structure
        } else {
            Node<T> current = head;
            while (current.next != head) {
                current = current.next;
            }
            current.next = newNode;
            newNode.next = head;
        }
        size++;
    }

    // Method to insert a new node at the beginning of the circular linked list
    public void insertAtBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            head.next = head; // Point to itself to form a circular structure
        } else {
            Node<T> current = head;
            while (current.next != head) {
                current = current.next;
            }
            newNode.next = head;
            head = newNode;
            current.next = head;
        }
        size++;
    }

    // Method to delete the first occurrence of a node with given data
    public boolean delete(T data) {
        if (head == null) {
            return false;
        }
        if (head.data.equals(data)) {
            if (head.next == head) {
                head = null;
            } else {
                Node<T> current = head;
                while (current.next != head) {
                    current = current.next;
                }
                current.next = head.next;
                head = head.next;
            }
            size--;
            return true;
        }
        Node<T> current = head;
        while (current.next != head) {
            if (current.next.data.equals(data)) {
                current.next = current.next.next;
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Method to delete all nodes with given data
    public void deleteAll(T data) {
        while (delete(data)) {
            // Keep deleting until no more nodes with given data exist
        }
    }

    // Method to clear the circular linked list
    public void clear() {
        head = null;
        size = 0;
    }

    // Method to check if the circular linked list is empty
    public boolean isEmpty() {
        return head == null;
    }

    // Method to get the size of the circular linked list
    public int getSize() {
        return size;
    }

    // Method to display the circular linked list
    public void display() {
        System.out.println("Size: " + getSize());

        if (head == null) {
            System.out.println("Circular Linked List is empty.");
            return;
        }

        Node<T> current = head;
        do {
            System.out.print(current.data.toString() + " -> ");
            current = current.next;
        } while (current != head);

        System.out.println("\n");
    }

    public static void main(String[] args) {
        CircularLinkedList<Integer> circularList = new CircularLinkedList<>();

        System.out.println(circularList.isEmpty());// true

        circularList.add(1);
        System.out.println(circularList.isEmpty());// false

        System.out.println("SIZE = " + circularList.getSize()); // SIZE = 1

        circularList.insertAtBeginning(0);
        circularList.display(); // 0 -> 1 -> 0 (circular)

        circularList.add(2);
        circularList.add(3);
        circularList.display(); // 0 -> 1 -> 2 -> 3 -> 0 (circular)

        circularList.delete(2);
        circularList.display(); // 0 -> 1 -> 3 -> 0 (circular)

        circularList.clear();
        circularList.display(); // Circular Linked List is empty.
    }
}
