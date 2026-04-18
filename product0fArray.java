package arraysnstruct;

public class product0fArray {
    static void main() {
        int[] arr = {2,3,3,2};
        int product = 1;
        for(int i = 0 ; i < arr.length ; i++){
            product *= arr[i];
        }
        System.out.println(product);
    }
}
