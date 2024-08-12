import java.util.ArrayList;

public class EmptyArrayList {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // display the original list
        System.out.println("Original list: " + colors);

        // Empty the ArrayList
        colors.clear();

        // display the list after emptying it
        System.out.println("List after emptying: " + colors);
    }
}
