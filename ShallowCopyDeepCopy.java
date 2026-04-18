package arraysnstruct;

import java.util.Arrays;

public class ShallowCopyDeepCopy {
    static void main() {
        int[] arr = {12,34,23,2,89};
       // int[] x = arr; // x is shallow copy of arr
        // x[0] = 10000;
        System.out.println(arr[0]);
        int[] y = Arrays.copyOf(arr, arr.length); // deep copy of arr
        y[0] = 100000;
        System.out.println(y[0]);
        System.out.println(arr[0]);
        // deep copy does not make any changes in og array
    }
}
