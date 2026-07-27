package learning.javacore.itbulls.operations;

import java.util.Scanner;

public class CodingTestThree {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int radius = sc.nextInt();
        double circumference = 2 * Math.PI * radius;
        System.out.println("Circumference: " + circumference );
    }
}
