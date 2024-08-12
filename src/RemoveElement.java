import java.util.ArrayList;

public class RemoveElement {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");


        // Remove the third element (index 2)
        colors.remove(2);

        // display the updated list
        System.out.println("Updated list: " + colors);
    }
}