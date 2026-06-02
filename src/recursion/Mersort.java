package recursion;

public class Mersort {

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 1, 6, 7, 3};
        mergeSort(arr);
        for (int ele : arr) {
            System.out.print(ele + " ");
        }
    }

    // Recursive merge sort function
    static void mergeSort(int[] arr) {
        int n = arr.length;

        // Step 0: Base case - if array has 1 or 0 elements, it's already sorted
        if (n <= 1) return;

        // Step 1: Create two subarrays
        int[] a = new int[n / 2];
        int[] b = new int[n - n / 2];

        // Step 2: Copy elements into subarrays
        for (int i = 0; i < a.length; i++) {
            a[i] = arr[i];
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = arr[i + a.length];
        }

        // Step 3: Recursively sort the subarrays
        mergeSort(a);
        mergeSort(b);

        // Step 4: Merge the sorted subarrays back into original array
        merge(a, b, arr);
    }

    // Merge two sorted arrays a and b into array c
    static void merge(int[] a, int[] b, int[] c) {
        int i = 0, j = 0, k = 0;

        // Compare elements of a and b and copy the smaller one into c
        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        // Copy any remaining elements from a
        while (i < a.length) {
            c[k++] = a[i++];
        }

        // Copy any remaining elements from b
        while (j < b.length) {
            c[k++] = b[j++];
        }
    }
}