import java.util.ArrayList;

public class CloneArrayList {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Red");
        originalList.add("Green");
        originalList.add("Blue");
        originalList.add("Yellow");
        originalList.add("Purple");

        // Clone the ArrayList
        ArrayList<String> clonedList = (ArrayList<String>) originalList.clone();

        // display the original and cloned lists
        System.out.println("Original list: " + originalList);
        System.out.println("Cloned list: " + clonedList);
    }
}
