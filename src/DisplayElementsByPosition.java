import java.util.ArrayList;

public class DisplayElementsByPosition {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // display all elements using their positions
        for (int i = 0; i < colors.size(); i++) {
            System.out.println("Element at index " + i + ": " + colors.get(i));
        }
    }
}
