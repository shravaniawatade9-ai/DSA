package arraysnstruct;

public class Linearsearch {
    static void main() {
        int[] arr = {2,13,32,21,88,13};
        int target = 13;
        boolean flag = false;
//        for(int i = 0 ; i < arr.length ; i++){
//            if(arr[i] == target){
//                System.out.println("Element found at index " + i);
//            }
//            else{
//                System.out.println("Element not found at index " + i);
//            }
//        }
//       o/p(without flag & break) : -
//        Element not found at index 0
//        Element found at index 1
//        Element not found at index 2
//        Element not found at index 3
//        Element not found at index 4
//        Element found at index 5
//checks and prints for every element hence "flag"
//even if element is present twice we want it to be printed only once hence "Break;" statement
        for(int i = 0 ; i < arr.length ; i++){
            if(arr[i] == target){
                flag = true;
                break;
            }
        }
        if(flag == true){
            System.out.println("\ntarget is present in array");
        }
        else{
            System.out.println("\ntarget is not present in array");
        }
    }
}
