import java.util.ArrayList;
import java.util.Collections;

public class CopyArrayList {
    public static void main(String[] args) {
        // Create an ArrayList and add some elements
        ArrayList<String> originalList = new ArrayList<>();
        originalList.add("Red");
        originalList.add("Green");
        originalList.add("Blue");
        originalList.add("Yellow");
        originalList.add("Purple");

        // Create another ArrayList
        ArrayList<String> copiedList = new ArrayList<>(originalList);

        System.out.println("Copied list: " + copiedList);
    }
}
