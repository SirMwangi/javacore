package learning.javacore.itbulls.operators;

public class operators {
    public static void main (String[] args) {
     // Binary arithmetic operators
     //+, -, /, %, *

   //     int a = 3 % 2;
  //      System.out.println(a);

    // ======= Bitwise Operators
    // &, |, ^, ~, >>, >>>, <<
    System.out.println("==Bitwise operators==");

        int a1 = 5; // Binary: 00000101
        int b1 = 3; // Binary: 00000011

        System.out.println("a & b   = " + (a1 & b1));   // AND: 00000101 & 00000011 = 00000001 (1). Only bits that are 1 in BOTH numbers remain 1.

        System.out.println("a | b   = " + (a1 | b1));   // OR:  00000101 | 00000011 = 00000111 (7). A bit is 1 if it is 1 in EITHER number.

        System.out.println("a ^ b   = " + (a1 ^ b1));   // XOR: 00000101 ^ 00000011 = 00000110 (6). A bit is 1 only when the corresponding bits are DIFFERENT.

        System.out.println("~a      = " + (~a1));       // NOT: ~00000101 = 11111010 (shown as 32 bits in Java). Every bit is flipped. In two's complement this equals -6.

        System.out.println("a << 1  = " + (a1 << 1));   // Left Shift: 00000101 << 1 = 00001010 (10). All bits move left by 1, a 0 fills the rightmost bit. Equivalent to 5 × 2 = 10.

        System.out.println("a >> 1  = " + (a1 >> 1));   // Signed Right Shift: 00000101 >> 1 = 00000010 (2). All bits move right by 1, the leftmost bit is filled with the sign bit (0 here). Equivalent to 5 / 2 = 2.

        System.out.println("a >>> 1 = " + (a1 >>> 1));  // Unsigned Right Shift: 00000101 >>> 1 = 00000010 (2). All bits move right by 1, the leftmost bit is ALWAYS filled with 0. Same result as >> for positive numbers, differs for negative numbers.

        //Ternary Operators
        System.out.println(a1 > b1 ? "a1 is greater than b1" : "a1 is not less than b1");
        System.out.println(a1 < b1 ? "a1 is greater than b1" : "a1 is not less than b1");

        // Operator precedence is the Java way of saying BODMAS in mathematics
    }
}
