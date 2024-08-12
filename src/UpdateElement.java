import java.util.ArrayList;

public class UpdateElement {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");


        // Specify the index and the new element
        int index = 2;
        String newElement = "Orange";

        // Update the element at the specified index
        colors.set(index, newElement);

        // display the updated list
        System.out.println("Updated list: " + colors);
    }
}