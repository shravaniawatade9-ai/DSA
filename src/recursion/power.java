package recursion;

import java.util.Scanner;

public class power {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = degree(a, b);
        System.out.println(result);
    }

    static int degree(int a, int b) {
        if( b == 0) return a;
        int ans =a*degree(a, b-1);
        b--;
        return ans;
    }
}
