import java.util.ArrayList;

public class CompareArrayLists {
    public static void main(String[] args) {
        // Create two ArrayLists and add some elements
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Blue");
        list1.add("yellow");
        list1.add("purple");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Red");
        list2.add("Green");
        list2.add("Blue");
        list2.add("yellow");
        list2.add("purple");

        // Compare the two ArrayLists
        boolean areEqual = list1.equals(list2);

        // display the result
        if (areEqual) {
            System.out.println("The two lists are equal.");
        } else {
            System.out.println("The two lists are not equal.");
        }
    }
}
