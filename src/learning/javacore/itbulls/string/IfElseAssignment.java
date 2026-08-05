package learning.javacore.itbulls.string;

import java.util.Scanner;

public class IfElseAssignment {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Who would you like to log in as: ");
        String word = sc.next();

        if (word.equals("--admin")) {
            System.out.println("Hello Admin! ");
        } else if (word.equals("--guest")) {
            System.out.println("Hello Guest! ");
        } else {
            System.out.println("Please, select either 'ADMIN' or 'GUEST' mode for this program");
        }

    }
}
