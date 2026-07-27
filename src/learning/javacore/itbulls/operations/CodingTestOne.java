package learning.javacore.itbulls.operations;

import java.util.Scanner;

public class CodingTestOne {
    public static void main (String[] args){
                Scanner sc = new Scanner(System.in);
                System.out.print("please enter any integer: ");
                int i = sc.nextInt();
                System.out.print("please enter another integer: ");
                int j = sc.nextInt();
                int sumofintegers = i + j;
                System.out.println("This is the sum of the two integers: " + sumofintegers);

    }
}
