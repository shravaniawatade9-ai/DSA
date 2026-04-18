package arraysnstruct;

import java.util.Scanner;

public class arraybasics {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] shravani = new int[10];
        System.out.println("Enter the 5 elements in the array\n");
        for (int i = 0; i < 5; i++) {
            shravani[i] = sc.nextInt();    //here when u write sc.nextInt() it pauses and asks to type i.e I/P
        }
        for (int i = 0; i < 5; i++) {
            System.out.print(shravani[i] + " ");
        }
    }
}
