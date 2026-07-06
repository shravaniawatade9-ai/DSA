package linkedlist;
//class data type
class Node{
    int val;
    Node next;
    //constructor : allows you to pass specific value so that variable has specific value from the start;
    Node (int val){
        this.val = val;
    }
}

public class needoflinkeedlist {
    static void main() {
        // 10 20 30 40 50
        //node banaye aur unme value store kari
        // if constructor is not made;

        // Node a = new Node(); a.val = 10;

        // becuz of constructor val can store dirct values in Node like ex. Node(val 10)
        //otherwise u have to do
        //Node a = new Node()
        // a.val = 10;
        //Node b = new Node()
        // b.val = 20;
        Node a = new Node(10); // variable has specific value from the start bcuz of constructor
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);

        // a ka next b;b ka next c and so on
        // so b is a.next
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        //both prints same address so yep b is a.next
        System.out.println(b);
        System.out.println(a.val);
        System.out.println(a.next);
        System.out.println(c);
        System.out.println(a.next.next);  // will give address of c
        System.out.println(a.next.next.val);  // will give value of c

    }
}
