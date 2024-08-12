import java.util.ArrayList;

public class RetrieveElement {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");

        // Specify the index of the element to retrieve
        int index = 2;

        // Retrieve the element at the specified index
        String element = colors.get(index);

        // display the retrieved element
        System.out.println("Element at index " + index + ": " + element);
    }
}