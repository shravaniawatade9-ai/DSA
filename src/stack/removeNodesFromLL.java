package stack;

import java.util.ArrayDeque;
import java.util.Deque;

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class removeNodesFromLL {

    public ListNode removeNodes(ListNode head) {
        Deque<ListNode> st = new ArrayDeque<>();
        ListNode temp = head;

        while (temp != null) {
            // drop every node on the stack that is smaller than the current one
            while (!st.isEmpty() && st.peek().val < temp.val) {
                st.pop();
            }
            // link the surviving node to the current one
            if (!st.isEmpty()) {
                st.peek().next = temp;
            }
            st.push(temp);
            temp = temp.next;
        }

        // the bottom of the stack is the head of the result
        return st.peekLast();
    }

    // ---------- helpers for testing ----------
    private static ListNode build(int... vals) {
        ListNode dummy = new ListNode();
        ListNode cur = dummy;
        for (int v : vals) {
            cur.next = new ListNode(v);
            cur = cur.next;
        }
        return dummy.next;
    }

    private static void print(ListNode head) {
        StringBuilder sb = new StringBuilder();
        while (head != null) {
            sb.append(head.val);
            if (head.next != null) sb.append(" -> ");
            head = head.next;
        }
        System.out.println(sb);
    }

    public static void main(String[] args) {
        removeNodesFromLL sol = new removeNodesFromLL();

        print(sol.removeNodes(build(5, 2, 13, 3, 8)));  // 13 -> 8
        print(sol.removeNodes(build(1, 1, 1, 1)));      // 1 -> 1 -> 1 -> 1
        print(sol.removeNodes(build(9, 7, 5, 3)));      // 9 -> 7 -> 5 -> 3
    }
}