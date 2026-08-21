package learning.javacore.itbulls.collections.onlinestoreassignment;

import java.util.ArrayList;
import java.util.List;

public class Arraylist {
    public static void main(String[] args) {
        // 1. Create the ArrayList using the interface type
        List<Integer> numbers = new ArrayList<>();

        int targetSize = 1_000_000; // Using underscores for readability in large numbers

        // 2. Loop to add 1,000,000 Integer objects
        for (int i = 1; i <= targetSize; i++) {
            // Java automatically boxes the primitive 'i' into an Integer object (Autoboxing)
            numbers.add(i);
        }

        System.out.println("Successfully added " + numbers.size() + " elements!");
    }
}