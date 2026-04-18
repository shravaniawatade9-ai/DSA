package arraysnstruct;

public class segregate {
    static void main() {
       int[] arr = {1,1,0,2,2,0,0,1,1};
       int numsOf_0 =  0;
       int numsOf_1 =  0;
       int numsOf_2 =  0;

       for (int i = 0; i < arr.length; i++) {
           if (arr[i] == 0) {
               numsOf_0++;
           }
           else if (arr[i] == 1) {
               numsOf_1++;
           }
           else {
               numsOf_2++;
           }
       }
       for (int i = 0; i < numsOf_0 ; i++) {
           arr[i] = 0;
       }
       for (int i = numsOf_0; i < numsOf_0 + numsOf_1 ; i++) {
           arr[i] = 1;
       }
       for (int i = numsOf_0 + numsOf_1;i < arr.length ; i++) {
           arr[i] = 2;
       }
        System.out.println("the segregated array is:");
        for(int ele : arr){
            System.out.print(ele + " ");
        }
    }
}

