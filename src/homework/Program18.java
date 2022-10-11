package homework;
/* A Java program to print the sum (addition), multiply, subtract, divide and
remainder of two numbers.
Test Data:
Input first number: 125
Input second number: 24
Expected Output :
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24 = 5
125 mod 24 = 5
 */

public class Program18 {
    int a = 125;
    int b = 24;

    public static void main(String[] args) {
        Program18 math = new Program18();
        math.addition();
        math.subtraction();
        multiplication();
        math.division();
        math.remainder();

    }

    void addition() {
        System.out.println("125 + 24 = " + (a + b));
    }

    void subtraction() {
        System.out.println("125 - 24 = " + (a - b));
    }

    static void multiplication() {
        Program18 multiply = new Program18();
        System.out.println("125 x 24 = " + (multiply.a * multiply.b));
    }

    void division() {
        System.out.println("125 / 24 = " + (a / b));
    }

    void remainder() {
        System.out.println(" 125 mod 24 = " + (a % b));
    }

}
