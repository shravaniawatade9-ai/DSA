// 1. Definition of the Node structure
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
        this.next = null;
    }
}

// 2. Custom LinkedList Class
class MyLinkedList {
    Node head = null;
    Node tail = null;
    int size = 0;

    // Display/Traverse the Linked List
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Insert at the End (Tail)
    public void insertAtEnd(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
        } else {
            tail.next = temp;
        }
        tail = temp;
        size++;
    }

    // Insert at the Beginning (Head)
    public void insertAtHead(int val) {
        Node temp = new Node(val);
        if (head == null) {
            head = temp;
            tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }
        size++;
    }

    // Insert at any Given Index
    public void insert(int idx, int val) {
        if (idx < 0 || idx > size) {
            System.out.println("Invalid Index!");
            return;
        }
        if (idx == 0) {
            insertAtHead(val);
            return;
        }
        if (idx == size) {
            insertAtEnd(val);
            return;
        }

        Node t = new Node(val);
        Node temp = head;
        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }
        t.next = temp.next;
        temp.next = t;
        size++;
    }

    // Get value at a specific Index
    public int getAt(int idx) {
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid Index!");
            return -1;
        }
        Node temp = head;
        for (int i = 1; i <= idx; i++) {
            temp = temp.next;
        }
        return temp.val;
    }

    // Delete node at a specific Index
    public void deleteAt(int idx) {
        if (idx < 0 || idx >= size) {
            System.out.println("Invalid Index!");
            return;
        }
        if (idx == 0) {
            head = head.next;
            if (head == null) tail = null; // if list becomes empty
            size--;
            return;
            // or deleteAthead();
        }
        //Main concept

        Node temp = head;
        for (int i = 1; i <= idx - 1; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if (idx == size - 1) { // if deleting the last node, update tail
            tail = temp;
        }
        size--;
    }
}

// 3. Main execution class
public class operations {
    public static void main(String[] args) {
        MyLinkedList ll = new MyLinkedList();

        ll.insertAtEnd(10);
        ll.insertAtEnd(20);
        ll.insertAtEnd(30);
        ll.insertAtEnd(40);
        ll.insertAtEnd(50);

        System.out.print("Initial List: ");
        ll.display(); // Expected: 10 -> 20 -> 30 -> 40 -> 50 -> null

        System.out.println("Inserting 60 at index 3...");
        ll.insert(3, 60);
        ll.display(); // Expected: 10 -> 20 -> 30 -> 60 -> 40 -> 50 -> null

        System.out.println("Node at index 2: " + ll.getAt(2)); // Expected: 30

        System.out.println("Deleting node at index 3...");
        ll.deleteAt(3);
        ll.display(); // Expected: 10 -> 20 -> 30 -> 40 -> 50 -> null

        System.out.println("Total Size: " + ll.size); // Expected: 5
    }
}