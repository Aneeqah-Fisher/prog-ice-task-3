import java.util.ArrayList;

public class ReplaceElement {
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

        // Replace the second element (index 1) with the specified element
        colors.set(1, "Orange");

        // display the updated list
        System.out.println("Updated list: " + colors);
    }
}
