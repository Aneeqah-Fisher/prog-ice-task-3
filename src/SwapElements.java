import java.util.ArrayList;
import java.util.Collections;

public class SwapElements {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");


        // Swap the elements at index 1 and index 3
        Collections.swap(colors, 1, 3);

        // display the list after swapping
        System.out.println("List after swapping: " + colors);
    }
}

