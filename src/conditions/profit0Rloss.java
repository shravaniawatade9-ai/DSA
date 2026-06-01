package conditions;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class profit0Rloss {
    static void main() {
        // if cost price of an item is i/p , write a program to determine whether the seller has made profit or loss
        // or no profit no loss . also determine how much profit or loss he  has made
        //cost price (CP) selling price (SP)
        Scanner sc = new Scanner(System.in);
        System.out.println("enter cost price and selling price");
        double cp = sc.nextDouble();
        double sp = sc.nextDouble();
        double n = sp - cp;

        // if sp>cp then profit otherwise loss so if" cp=sp " ex let both are 20 rs so no profit no loss
// but as they are equal condition of if gets false and it prints " seller has made loss " if we take on;y two conditions
//using if else and not if if else 

        if (sp > cp) {
            System.out.println("the seller has made profit of :");
            System.out.println(n);
        }

        if (cp > sp) {
            System.out.println("seller has made loss of");
            System.out.println(n);
        } else {
            System.out.println("no profit no loss");
        }
    }
}