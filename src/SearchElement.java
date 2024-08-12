import java.util.ArrayList;

public class SearchElement {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Element to search for
        String searchElement = "Blue";

        // Check if the element exists in the ArrayList
        if (colors.contains(searchElement)) {
            System.out.println(searchElement + " is found in the list.");
        } else {
            System.out.println(searchElement + " is not found in the list.");
        }
    }
}

