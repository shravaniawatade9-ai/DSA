package arraysnstruct;
import java.util.Arrays; // write this to use Arrays.sort buil in feature
public class sortarraybuiltin {
    static void main() {
        //sort acsending order
        int[] arr = {6,23,56,-3,34};
        print(arr);
        Arrays.sort(arr);
        System.out.println("\nSorted array using built-in sort");
        print(arr);


    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
