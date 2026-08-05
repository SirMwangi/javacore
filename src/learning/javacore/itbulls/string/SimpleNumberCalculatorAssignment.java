package learning.javacore.itbulls.string;



public class SimpleNumberCalculatorAssignment {
    public static void main (String[] args) {
        String first = args [0];
        String second = args [1];

        if (first.contains(".") || second.contains(".")) {

            double num1 = Double.parseDouble(first);
            double num2 = Double.parseDouble(second);

            System.out.println(num1 + num2);

        }else {
            int num1 = Integer.parseInt(first);
            int num2 = Integer.parseInt(second);

            System.out.println(num1 + num2);
        }


    }
}
