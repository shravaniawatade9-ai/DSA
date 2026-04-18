package arraysnstruct;

public class merge2sortedarrays {
    static void main() {
        int[] a = {1, 2, 3, 7, 20};
        int[] b = {6, 8, 9, 10,15};
        int[] c = new int[a.length + b.length];

        System.out.println("the merged sorted array is:");

        merge(a,b,c);
        for(int ele : c){
            System.out.print(ele + " ");
        }
    }

    static void merge(int[] a, int[] b, int[] c) {
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];    // | this is c[k] = a[i]|
            }                       // | k++;               |
                                    // | i++;               |
                                    //i.e first it will assign the value
                                    //c[k] = a[i]
                                    //then it will increament
            else {
                c[k++] = b[j++];
            }
        }
        //copy remaining eles of a
        while (i < a.length) {
            c[k++] = a[i++];
        }
        //copy remaining eles of b
        while (j < b.length) {
            c[k++] = b[j++];
        }
    }
}
