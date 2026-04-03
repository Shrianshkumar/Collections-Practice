/* Program to display ArrayList and its size:
 add() method is used to append element to the list. 
 size() method returns the length of list. */

import java.util.ArrayList;
public class DisplayArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(21);
        arr.add(12);
        arr.add(30);
        arr.add(87);
        System.out.println("List: " + arr);
        System.out.print("List size: " + arr.size());
    }
}
