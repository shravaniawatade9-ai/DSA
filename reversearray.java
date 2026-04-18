package arraysnstruct;

public class reversearray {
    static void main() {
        int[] arr = {1,2,3,45,67};
        int n  = arr.length;
        int i=0,j=n-1;
        int temp;
        System.out.println("og array:");
        for(int element : arr){
            System.out.print(element + " ");
        }
        //swap {i} th element and j = {n - 1} th
        while (i<j){
            temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("\n");
        System.out.println("reverse array:");
        for(int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
