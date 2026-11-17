package collections;

import java.util.ArrayList;
import java.util.List;

public class ListVsArray {
    public static void main(String[] args) {
        int[] arr = new int[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        // arr[3] = 4;
        List<Integer> list = new ArrayList<Integer>() {
            {
                add(1);
                add(2);
                add(3);
                add(4);
            }
        };
        System.out.println("Size: " + list.size());
        System.out.println("List: " + list);
        list.add(1, 99);
        System.out.println("List after adding 99 at index 1: " + list);
    }
}
