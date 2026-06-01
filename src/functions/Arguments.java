package functions;

public class Arguments {
    public static void max(int a, int b, int c) { // parameters =(variables) like boxes that store value
        if (a >= b && a >= c) {
            System.out.println(a);
        } 
        else if (b >= a && b >= c){ 
            System.out.println(b);
        } 
        else {
            System.out.println(c);
        }
    }

    // remember code always starts from """main""" function
    static void main() {
        System.out.println("the max num is :");
        max(1, 5, 16); // arguments (values stored in boxes)
    }
}

