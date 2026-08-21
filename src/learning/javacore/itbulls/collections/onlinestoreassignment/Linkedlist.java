package learning.javacore.itbulls.collections.onlinestoreassignment;

import java.util.LinkedList;
import java.util.List;

public class Linkedlist {
    public static void main(String[] args) {
        // 1. Create LinkedList object and add 1,000,000 Integer elements
        List<Integer> numbers = new LinkedList<>();

        int targetSize = 1_000_000;
        for (int i = 1; i <= targetSize; i++) {
            numbers.add(i); // Appends to the end by default
        }

        System.out.println("LinkedList populated with " + numbers.size() + " elements.");

        // 2. Call the method to add integers to the beginning of the list
        int amountToAdd = 1000;
        addToBeginning(numbers, amountToAdd);

        System.out.println("Added " + amountToAdd + " elements to the beginning.");
    }

    /**
     * Method that takes a list as an argument and adds a specific amount
     * of integers into the beginning of the list.
     */
    public static void addToBeginning(List<Integer> list, int amount) {
        for (int i = 0; i < amount; i++) {
            // Inserting at index 0 places the new element at the very head of the list
            list.add(0, -1);
        }
    }
}

