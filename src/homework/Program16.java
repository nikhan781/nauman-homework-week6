package homework;
/* A Java program to add two binary numbers.
Input Data:
Input first binary number: 10
Input second binary number: 11
Expected Output:
Sum of two binary numbers: 101
 */

import java.util.Scanner;

public class Program16 {
    public static void main(String[] args) {
        Program16 binaryAdd = new Program16();
        binaryAdd.additionBinary();
    }

    static void additionBinary() {
        Scanner binary = new Scanner(System.in);
        System.out.print("Input first binary number: ");
        String firstB = binary.nextLine();
        System.out.print("Input 2nd binary number: ");
        String secondB = binary.nextLine();
        int a = Integer.parseInt(firstB, 2);
        int b = Integer.parseInt(secondB, 2);
        int sum = a + b;
        System.out.println("Sum of two binary: " + Integer.toBinaryString(sum));
        binary.close();
    }
}
