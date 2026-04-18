package arraysnstruct;

public class segreby2Pt {
    static void main() {
        int[] arr = {1,1,0,0,0,1,0};
        int n =  arr.length;
        int i = 0, j = n-1;
        while (i<j){
            if(arr[i]==0) i++;
            if (arr[j]==1) j--;
            if(i>=j) break; //imp write the concept of this if condition
            if(arr[i]==1 && arr[j]==0) {
                arr[i]=0;
                arr[j]=1;
                i++;
                j--;
            }

        }
        System.out.println("the segregated array is:");
        for(int k=0;k<arr.length;k++){
            System.out.print(arr[k]+" ");
        }

    }
}
