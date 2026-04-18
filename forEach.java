package arraysnstruct;

public class forEach {
    static void main() {
        int[] arr = {2,3,3,2};
        //traverse of array i.e traveling through array for each is used
        for(int ele : arr){  // int shrav : arr or int vir : arr can creat anything
            System.out.print(ele+" "); // prints each element no need of for loop
        }
        System.out.println("\n");
        for(int ele : arr){
            ele +=2;
            System.out.print(ele+" ");//drawback make cant changes in array using for each
        }
        System.out.println("\nusing for loop");
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] +=2;
            System.out.print(arr[i]+" ");//in for loop changes are allowed
        }
    }
}
