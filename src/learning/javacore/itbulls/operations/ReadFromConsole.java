package learning.javacore.itbulls.operations;

import java.util.Scanner;

public class ReadFromConsole {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please, enter any word:");
        String word = sc.next();
        System.out.println("you entered this word:" + " " + word);
        System.out.print("Please, enter any integer number:");
        int i = sc.nextInt();
        System.out.println("You have entered this integer:" + " " + i);

    }
}


