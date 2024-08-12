import java.util.ArrayList;
import java.util.List;

public class ExtractPortion {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");


        // Extract a portion of the ArrayList
        List<String> subList = colors.subList(1, 4);

        // display the extracted portion
        System.out.println("Extracted portion: " + subList);
    }
}
