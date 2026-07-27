package learning.javacore.itbulls.operations;

import java.util.Scanner;


public class CodingTestTwo {
    public static void main (String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter length of side A: ");
        double a = sc.nextInt();
        System.out.print("Enter length of side B: ");
        double b = sc.nextInt();
        System.out.print("Enter length of side C: ");
        double c = sc.nextInt();

        //Heron's formulae
        boolean isValidTriangle = (a + b > c) && (a + c > b) && (b + c > a);

        if (isValidTriangle) {
            double p = (a + b + c) / 2;
            System.out.println("P: " + p);
            double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
            System.out.println("Area: " + area);
        }else{
            System.out.println("NaN");
        }
    }
}
