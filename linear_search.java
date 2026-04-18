package arraysnstruct;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class linear_search {
    static void main() {
        int[] arr = {1, 34, 12, 44, 30};
        boolean flag = false;
        int x;
        System.out.println("enter the element you want to search");
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        for (int i = 0; i < 5; i++) {
            if (arr[i] == x) {
                flag = true;
                break;
            }
        }
        if (flag == true) {
            System.out.println("milala!!! >_<");
        }
        else {
            System.out.println("nahi  milala!!! >_<");
        }
    }
}