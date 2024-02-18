package datastructure;

class Node<T> {

    Node<T> next = null;
    T data = null;

    public Node(T data) {
        this.data = data;
    }
}

public class SinglyLinkedList<T> {

    private Node<T> parent;
    private Node<T> lastNode; // Pointer to the last node to reduce time complixty while adding node at the end of the linkedList
    private int nodesCounter = 0;

    public SinglyLinkedList() {
        parent = null;
        lastNode = null;
    }

    // Method to add a new node at the end of the linked list
    public void add(T data) {
        Node<T> newNode = new Node<>(data);
        if (parent == null) {
            parent = newNode;
            lastNode = newNode;
        } else {
            lastNode.next = newNode;
            lastNode = newNode;
        }
        nodesCounter++;
    }

    // Method to delete the first occurrence of a node with given data
    public boolean delete(T data) {
        if (parent != null) {
            if (parent.data.equals(data)) {
                parent = parent.next;
                nodesCounter--;
                return true;
            }

            Node<T> current = parent;
            Node<T> next = parent.next;
            while (next != null) {
                if (next.data.equals(data)) {
                    current.next = next.next;
                    nodesCounter--;
                    return true;
                }
                current = next;
                next = next.next;
            }
        }
        return false;
    }

    // Method to delete all nodes with given data
    public void deleteAll(T data) {
        if (parent != null) {
            while (parent != null && parent.data.equals(data)) {
                parent = parent.next;
                nodesCounter--;
            }

            Node<T> current = parent;
            Node<T> next = parent != null ? parent.next : null;
            while (next != null) {
                if (next.data.equals(data)) {
                    current.next = next.next;
                    nodesCounter--;
                } else {
                    current = next;
                }
                next = current != null ? current.next : null;
            }
        }
    }

    // Method to clear the linked list
    public void clear() {
        parent = null;
        lastNode = null;
        nodesCounter = 0;
    }

    public boolean isEmpty() {
        return parent == null;
    }

    // Method to get the size of the linked list
    public int getSize() {
        return nodesCounter;
    }

    // Method to display the linked list
    public void display() {
        System.out.println("Size: " + getSize());

        Node<T> temp = parent;

        while (temp != null) {
            System.out.print(temp.data.toString());
            temp = temp.next;

            if (temp != null) {
                System.out.print(" -> ");
            }
        }

        System.out.println("\n");
    }

    public static void main(String[] args) {
        SinglyLinkedList<Integer> linkedList = new SinglyLinkedList<>();

        System.out.println(linkedList.isEmpty());              // true

        linkedList.add(1);
        System.out.println(linkedList.isEmpty());             // false

        System.out.println("SIZE = " + linkedList.getSize()); // SIZE = 1

        linkedList.add(2);
        linkedList.display();                                 // 1 -> 2

        linkedList.add(3);
        linkedList.add(4);
        linkedList.display();                                 // 1 -> 2 -> 3 -> 4

        linkedList.add(5);
        linkedList.add(4);
        linkedList.display();                                 // 1 -> 2 -> 3 -> 4 -> 5 -> 4

        linkedList.add(3);
        linkedList.add(2);
        linkedList.display();                                 // 1 -> 2 -> 3 -> 4 -> 5 -> 4 -> 3 -> 2

        linkedList.deleteAll(4);
        linkedList.display();                                 // 1 -> 2 -> 3 -> 5 -> 3 -> 2

        linkedList.clear();
        linkedList.add(2);
        linkedList.display();                                 // 2
    }
}
