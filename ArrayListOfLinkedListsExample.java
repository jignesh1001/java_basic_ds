import java.util.ArrayList;
import java.util.LinkedList;


public class ArrayListOfLinkedListsExample {
    public static void main(String[] args) {
        // Creating an ArrayList of LinkedLists
        ArrayList<LinkedList<Integer>> arrayListOfLinkedLists = new ArrayList<>();

        // Adding LinkedLists to the ArrayList
        arrayListOfLinkedLists.add(new LinkedList<>());
        arrayListOfLinkedLists.add(new LinkedList<>());
        arrayListOfLinkedLists.add(new LinkedList<>());

        // Adding elements to the first LinkedList
        arrayListOfLinkedLists.get(0).add(1);
        arrayListOfLinkedLists.get(0).add(2);
        arrayListOfLinkedLists.get(0).add(3);

        // Adding elements to the second LinkedList
        arrayListOfLinkedLists.get(1).add(4);
        arrayListOfLinkedLists.get(1).add(5);

        // Adding elements to the third LinkedList
        arrayListOfLinkedLists.get(2).add(6);

        // Accessing elements in the ArrayList of LinkedLists
        System.out.println(arrayListOfLinkedLists.get(0)); // Output: [1, 2, 3]
        System.out.println(arrayListOfLinkedLists.get(1)); // Output: [4, 5]
        System.out.println(arrayListOfLinkedLists.get(2)); // Output: [6]
    }
}
