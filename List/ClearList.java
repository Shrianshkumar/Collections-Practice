/* 
    Program to remove all elements from the list: clear() method removes all elements from the
    list.
    Instructions to code:
        Create list with 5 elements.
        Display List is not empty
        Remove all elements using clear() method
        Display List is empty.
 */

import java.util.*;

public class ClearList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10, 39, 60, 80));
        System.out.println("List: " + arr);
        arr.clear();
        System.out.println("List: " + arr);
    }
}