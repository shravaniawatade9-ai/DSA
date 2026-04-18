package arraysnstruct;

import java.util.Scanner;

public class sorting {
    static void main() {
        int temp;
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];       //ONLY allocates memory
        System.out.println("Enter the 5 elements in the array\n");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();    //here when u write sc.nextInt() it pauses and asks to type i.e I/P
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5 - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
        }
        System.out.println("sorted array is");
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + "\t");  // how to give tabspace allong with printing the element
        }
    }
}
