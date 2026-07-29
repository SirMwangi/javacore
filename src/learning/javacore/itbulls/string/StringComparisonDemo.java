package learning.javacore.itbulls.string;

public class StringComparisonDemo {
    public static void main(String[] args){
        System.out.println("== String Comparison ++");
        System.out.println();

        String s = " hello ";
        String s2 = " hello ";
        System.out.println("s == s2" + (s == s2));              //true; because they exist in the same pool of strings

        String s3 = new String(" hello ");               //In this case it is different because I create the string using the new keyword.
        System.out.println("s == s3: " + (s == s3));					// false: s3 is not in the string pool
        System.out.println("s.equals(s3): " + s.equals(s3)); 			// true
        System.out.println("s == s3.intern(): " + (s == s3.intern()));	// true: adds s3 to the string pool

        String firstName = "Frank";
        String firstName2 = "frank";
        System.out.println("firstName.equals(firstName2): " + firstName.equals(firstName2));                        //false
        System.out.println("firstName.equalsIgnoreCase(firstName2): " + firstName.equalsIgnoreCase(firstName2));    //true




    }
}
