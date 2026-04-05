/* 

    Program to remove index element: remove(int index) method removes element of specified index.
    Instructions to code:
        Create list with elements
        Read index value.
        If the index is valid remove the element and display list
        If the index is not valid display error message.  */

import java.util.*;
public class ReemoveElem {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(12, 23, 34, 45, 56));
        int idx = 4;
        if(idx >= 0 && idx <= arr.size()) {
            arr.remove(idx);
            System.out.println("Element removed: " + arr);
        } else {
            System.out.println("Invalid Index");
        }
    }
}