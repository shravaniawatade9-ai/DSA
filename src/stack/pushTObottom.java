package stack;

import java.util.Stack;

public class pushTObottom {
    static void main() {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        int ele = 50;
        System.out.println(st);
        pushToBottom(st, ele);
        System.out.println(st);
    }

    static void pushToBottom(Stack<Integer> st, int ele) {
        if (st.isEmpty()) {
            st.push(ele);
            return;
        }
        int top = st.pop();
        pushToBottom(st, ele);
        st.push(top);
    }
}
