import java.util.ArrayList;

public class TrimArrayList {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");


        // Trim the capacity of the ArrayList to its current size
        colors.trimToSize();

        // disply the list after trimming
        System.out.println("trimmed list: " + colors);
    }
}
