package homework;
/* A Java program to convert a decimal number to binary number.
Input Data:
Input a Decimal Number : 5
Expected Output
Binary number is: 101
 */

public class Program17 {
    static int a = 5;

    public static void main(String[] args) {

        myBin();
    }

    static void myBin() {
        String decBin = Integer.toBinaryString(a);
        System.out.println("Binary number is : " + decBin);
    }
}
