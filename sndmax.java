package arraysnstruct;

public class sndmax {
    static void main() {
        int[] arr = {-2,-5,-12,-53,-63};
        //find max
        int max = Integer.MIN_VALUE; //this initialise max variable with minvalue from array
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        //find second max
        int smax = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > smax && arr[i] != max ) {
                smax = arr[i];
            }
        }
        System.out.println("the max element is " + max);
        System.out.println("the second max element is" + smax);
    }
}
