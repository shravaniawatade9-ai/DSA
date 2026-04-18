package recursion;

import java.util.Scanner;

public class factorial {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = factorial(n);
        System.out.println(result);

    }

    static int factorial(int n) {
        if (n == 0|| n == 1) return 1;  // base case
        int ans = n*factorial(n-1);
        return ans;  // intger type function ; return is mandatory
    }
}
