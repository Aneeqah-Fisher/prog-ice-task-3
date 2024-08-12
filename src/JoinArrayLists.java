import java.util.ArrayList;

public class JoinArrayLists {
    public static void main(String[] args) {
        // Create the first ArrayList and add some elements
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("Red");
        list1.add("Green");
        list1.add("Blue");

        // Create the second ArrayList and add some elements
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Yellow");
        list2.add("Purple");
        list2.add("Orange");

        // Join the two ArrayLists
        ArrayList<String> joinedList = new ArrayList<>(list1);
        joinedList.addAll(list2);

        // display the joined list
        System.out.println("Joined list: " + joinedList);
    }
}
