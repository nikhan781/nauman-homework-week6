package homework;
/* A Java program that takes three numbers as input to calculate and
print the average of the numbers.
 */

import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        Program13 three = new Program13();
        three.myCalculation();
    }

    void myCalculation() {
        Scanner numbers = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        float a = numbers.nextFloat();
        System.out.print("Entre 2nd number: ");
        float b = numbers.nextFloat();
        System.out.print("Entre 3rd number: ");
        float c = numbers.nextFloat();
        float avg = ((a + b + c) / 3);
        System.out.println("The average is:  " + avg);
        numbers.close();
    }
}
