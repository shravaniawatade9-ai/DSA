package arraysnstruct;

import java.util.Scanner;

public class basics {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[4]; // creats empty of size 4
        System.out.println("Enter 4 elements in the array\n");
        //i/p
        //  OR
        //int n = arr.length      ************ prefer this more
        //for (int i = 0; i < n; i++) *************
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("the array of no. is :");
        for (int i = 0; i < 4; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
