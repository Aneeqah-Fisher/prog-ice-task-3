import java.util.ArrayList;

public class TestArrayListEmpty {
    public static void main(String[] args) {
        // Create an ArrayList
        ArrayList<String> colors = new ArrayList<>();

        // Check if the ArrayList is empty
        if (colors.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else  {
            System.out.println("The ArrayList is not empty.");
        }

        // Add an element to the ArrayList
        colors.add("Red");

        // Check again if the ArrayList is empty
        if (colors.isEmpty()) {
            System.out.println("The ArrayList is empty.");
        } else {
            System.out.println("The ArrayList is not empty.");
        }
    }
}
