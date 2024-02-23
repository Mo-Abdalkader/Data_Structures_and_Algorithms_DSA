package datastructure;

class Node<T> {

    Node<T> prev = null;
    Node<T> next = null;
    T data = null;

    public Node(T data) {
        this.data = data;
    }
}

public class DoublyLinkedList<T> {

    private Node<T> head;
    private Node<T> tail;
    private int size;

    public DoublyLinkedList() {
        head = null;
        tail = null;
        size = 0;
    }

    // Method to add a new node at the end of the linked list
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        size++;
    }

    // Method to insert a new node at the beginning of the linked list
    public void insertAtBeginning(T data) {
        Node<T> newNode = new Node<>(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // Method to insert a new node at a specific position in the linked list
    public void insertAtPosition(T data, int position) {
        if (position < 0 || position > size) {
            throw new IllegalArgumentException("Invalid position");
        }
        if (position == 0) {
            insertAtBeginning(data);
            return;
        }
        if (position == size) {
            add(data);
            return;
        }
        Node<T> newNode = new Node<>(data);
        Node<T> current = head;
        for (int i = 0; i < position - 1; i++) {
            current = current.next;
        }
        newNode.next = current.next;
        newNode.prev = current;
        current.next.prev = newNode;
        current.next = newNode;
        size++;
    }

    // Method to delete the first occurrence of a node with given data
    public boolean delete(T data) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                if (current == head) {
                    head = head.next;
                    if (head != null) {
                        head.prev = null;
                    } else {
                        tail = null;
                    }
                } else if (current == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Method to delete all nodes with given data
    public void deleteAll(T data) {
        Node<T> current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                if (current == head) {
                    head = head.next;
                    if (head != null) {
                        head.prev = null;
                    } else {
                        tail = null;
                    }
                } else if (current == tail) {
                    tail = tail.prev;
                    tail.next = null;
                } else {
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }
                size--;
            }
            current = current.next;
        }
    }

    // Method to clear the linked list
    public void clear() {
        head = null;
        tail = null;
        size = 0;
    }

    // Method to check if the linked list is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to get the size of the linked list
    public int getSize() {
        return size;
    }

    // Method to display the linked list
    public void display() {
        System.out.println("Size: " + getSize());

        if (head == null) {
            System.out.println("Doubly Linked List is empty.");
            return;
        }

        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data.toString());
            temp = temp.next;

            if (temp != null) {
                System.out.print(" <-> ");
            }
        }
        System.out.println("\n");
    }

    // Method to get the first element of the linked list
    public T getFirst() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    // Method to get the last element of the linked list
    public T getLast() {
        if (tail == null) {
            return null;
        }
        return tail.data;
    }

    // Method to find the middle element of the linked list
    public T findMiddle() {
        if (head == null) {
            return null;
        }
        Node<T> slow = head;
        Node<T> fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    // Method to reverse the linked list
    public void reverse() {
        if (head == null || head.next == null) {
            return;
        }
        Node<T> temp = null;
        Node<T> current = head;
        while (current != null) {
            temp = current.prev;
            current.prev = current.next;
            current.next = temp;
            current = current.prev;
        }
        if (temp != null) {
            head = temp.prev;
        }
    }

    public static void main(String[] args) {
        DoublyLinkedList<Integer> linkedList = new DoublyLinkedList<>();

        System.out.println(linkedList.isEmpty());                         // true

        linkedList.add(1);
        System.out.println(linkedList.isEmpty());                         // false

        System.out.println("SIZE = " + linkedList.getSize());             // SIZE = 1

        linkedList.insertAtBeginning(0);
        linkedList.display();                                             // 0 <-> 1

        linkedList.insertAtPosition(2, 2);
        linkedList.display();                                             // 0 <-> 1 <-> 2

        linkedList.add(3);
        linkedList.add(4);
        linkedList.display();                                             // 0 <-> 1 <-> 2 <-> 3 <-> 4

        System.out.println("First Element: " + linkedList.getFirst());    // First Element: 0
        System.out.println("Last Element: " + linkedList.getLast());      // Last Element: 4
        System.out.println("Middle Element: " + linkedList.findMiddle()); // Middle Element: 2

        linkedList.reverse();
        linkedList.display();                                            // 4 <-> 3 <-> 2 <-> 1 <-> 0

        linkedList.clear();                                              
        linkedList.display();                                            // Doubly Linked List is empty.
    }
}
