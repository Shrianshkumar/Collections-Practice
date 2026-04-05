/* 
    Insert element into specified index: add(int index, E e) method is used to insert element into
    specified index.
    Instructions to code:
        Create ArrayList with 5 elements 10, 20, 30, 40, 50
        Read index to insert.
        Check whether the index is present or not
        If the index is present, then read the value and insert.
        If the index is not present, display Error message
*/

import java.util.*;

public class InsertWithInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(10, 20, 30, 40, 50));
        try {
            System.out.print("Enter index: ");
            int idx = sc.nextInt(); 
            System.out.print("Enter element: ");
            int elem = sc.nextInt();

            if (idx >= 0 && idx <= arr.size()) {
                arr.add(idx, elem);
                System.out.println("Updated List: " + arr);
            } else {
                System.out.println("Invalid index! Range is 0 to " + arr.size());
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: You must enter a whole number.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        }
    }
}
