import java.util.ArrayList;

public class InsertElement {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");


        // Insert an element at the first position
        colors.add(0, "Pink");

        // display the updated list
        System.out.println("Updated list: " + colors);
    }
}