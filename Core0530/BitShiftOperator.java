// this note was copied from stack overflow:
// https://stackoverflow.com/questions/19058859/what-does-mean-in-java
// and the java document:
// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/op3.html


// The >>> operator is the unsigned right bit-shift operator in Java.
// It effectively divides the operand by  2 to the power of the right operand, or just 2 here.
//
// The difference between >> and >>> would only show up when shifting negative numbers.
// The >> operator shifts a 1 bit into the most significant bit if it was a 1,
// and the >>> shifts in a 0 regardless.

// see some demo code below:
package Core0530;


public class BitShiftOperator {

    // The unary bitwise complement operator "~" inverts a bit pattern;
    // it can be applied to any of the integral types, making every "0" a "1" and every "1" a "0".
    // For example, a byte contains 8 bits; applying this operator to a value
    // whose bit pattern is "00000000" would change its pattern to "11111111".
    private static void UnaryComplement(int i) {
        System.out.println("The Unary Bitwise Complement of 0 is: " + ~i);
    }


    // The signed left shift operator "<<" shifts a bit pattern to the left,
    // and the signed right shift operator ">>" shifts a bit pattern to the right.
    // The bit pattern is given by the left-hand operand, and the number of positions
    // to shift by the right-hand operand. The unsigned right shift operator ">>>" shifts
    // a zero into the leftmost position, while the leftmost position after ">>" depends on
    // sign extension.
    private static void DifferenceBetweenSignedAndUnsigned() {

        //          1:  00000000 00000000 00000000 00000001
        //+2147483647:  01111111 11111111 11111111 11111111
        // -2147483648: 10000000 00000000 00000000 00000000 [overflow]
        // ">>>" unsigned right shift will put a 0 on the MSB(most significant bit), no matter whether
        // the original number is a positive one(MSB is 0) or a negative one(MSB is 1)
        // so the answer for ">>>" is:
        // +1073741824: 01000000 00000000 00000000 00000000
        // but ">>" signed right shift will put a 1 on the MSB if the original number is a negative one
        // , and will put a 0 on the MSB if the original number is a positive one.
        // so the answer for ">>" is:
        // -1073741824: 11000000 00000000 00000000 00000000

        int a = 1;
        int b = 2147483647;

        System.out.println("Negative condition: ");
        System.out.println("unsigned right shift by >>> is: " + ((a + b) >>> 1));
        System.out.println("signed right shift by >>> is: " + ((a + b) >> 1));

        System.out.println();
        System.out.println("Positive condition: ");
        System.out.println("unsigned right shift by >>> is: " + (b >>> 1));
        System.out.println("unsigned right shift by >>> is: " + (b >> 1));

    }


    private static void DifferenceDemo() {
        int high = 2100000000;
        int low = 2000000000;
        System.out.println("middle using >>> 1 = " + ((low + high) >>> 1));
        // [/2] is signed divide, same as >> 1.
        System.out.println("middle using / 2   = " + ((low + high) / 2));
    }


    public static void main(String[] args) {

        UnaryComplement(0);

        System.out.println();
        DifferenceDemo();

        System.out.println();
        DifferenceBetweenSignedAndUnsigned();

    }


}