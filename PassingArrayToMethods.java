package arraysnstruct;

public class PassingArrayToMethods {
    static void main() {
        int[] x = {12,14,56,89};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);

    }

    static void change(int[] y) {
        y[2] = 78;  // even if we make change in Y still it changes x
        //in java this is called as pass by values i.e it passes only values not variable
        // i.e u can access that values using any variable i.e x and y both are same arrays

    }
}
