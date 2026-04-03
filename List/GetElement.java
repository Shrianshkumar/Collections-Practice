/* Program to display the element of specified index:
 get(int index) returns the element of specified index. */

import java.util.ArrayList;
public class GetElement {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(21);
        arr.add(12);
        arr.add(30);
        arr.add(87);
        System.out.print("Element at given index: " + arr.get(3));
    }
} 