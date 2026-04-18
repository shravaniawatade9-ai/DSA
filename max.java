package arraysnstruct;

public class max {
    static void main() {
        int[]arr = {12,34,23,2,89};
        int n = arr.length;
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max); //**always print after complete for loop
        // if u print in if it will just check it once than print the 1st max value the value after comparng just once
        // insted of overall max value
    }
}
