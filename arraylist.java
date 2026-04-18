package arraysnstruct;

import java.util.ArrayList;

public class arraylist {
    static void main() {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = arr.size();
        arr.add(25);
        arr.add(30);
        arr.add(40);
        arr.add(50);

        System.out.println(arr);
        //"set means at this index put this"
        arr.set(3,90); // have to use set cuz u cnt change it like arr[3] = 90 ; not allowed in arraylist
        System.out.println(arr);
        arr.remove(arr.size()-1);//or arr.remove(n-1);
        System.out.println(arr);

    }
}
