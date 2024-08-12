import java.util.ArrayList;

public class IncreaseArrayListSize {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");

        // display the original list
        System.out.println("Original list: " + colors);

        // Increase the capacity of the ArrayList to hold at least 10 elements
        colors.ensureCapacity(10);

        // Add more elements to the ArrayList
        colors.add("Yellow");
        colors.add("Purple");
        colors.add("Orange");

        // display the updated list
        System.out.println("Updated list: " + colors);
    }
}
