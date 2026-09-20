package stack;

import java.util.Stack;

public class stackbasics {
    static void main() {
        Stack<String> st = new Stack<>();
        st.push("Shravani");
        st.push("Viraj");
        st.push("Gouri");
        st.push("Vijay");
        System.out.println(st.size());
        System.out.println(st);
        st.pop();
        System.out.println(st+" "+st.size());
        System.out.println(st.peek());
        System.out.println(st.pop());

    }
}
