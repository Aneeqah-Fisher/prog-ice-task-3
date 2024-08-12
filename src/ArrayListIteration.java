import java.util.ArrayList;

public class ArrayListIteration {

        public static void main(String[] args) {
            // Create an ArrayList and add some elements
            ArrayList<String> colors = new ArrayList<>();
            colors.add("Red");
            colors.add("Green");
            colors.add("Blue");
            colors.add("Yellow");
            colors.add("Purple");

            // Iterate through all elements using a for-each loop
            for (String color : colors) {
                System.out.println(color);
            }
        }
    }