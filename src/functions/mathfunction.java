package functions;

import java.util.Scanner;

public class mathfunction {
    static void main() {
        // ""1"""" math functions """""""
       // System.out.println(Math.sqrt(100));      square root function
        // System.out.println(Math.cbrt(100));     cube root function
        // System.out.println(Math.abs(-45));         absolute value
      //  System.out.println(Math.floor(-7.3));
        //System.out.println(Math.ceil(3.00001));
        //System.out.println(Math.min(3,9)); """"CAN PUT ONLY TWO NUMS"""
        //System.out.println(Math.max(2,6));

        //FOR THREE NUMS
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3 nums");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(Math.max(Math.max(a,b),c));
    }
}
