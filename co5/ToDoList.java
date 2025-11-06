import java.util.*;

public class ToDoList {
    public static void main(String[] args) {
        ArrayList<String> tasks = new ArrayList<>();

        tasks.add("Buy groceries");
        tasks.add("Finish project");
        tasks.add("Call mom");

        tasks.remove("Finish project");

        String task = tasks.get(0);

        Collections.sort(tasks);

        boolean isEmpty = tasks.isEmpty();

        System.out.println("Sorted To-Do List: " + tasks);
        System.out.println("First Task: " + task);
        System.out.println("Is the list empty? " + isEmpty);
    }
}
