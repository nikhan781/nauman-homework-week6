package homework;
/* A program to insert any temperature value in degree Fahrenheit and
convert to degree Celsius ((F − 32) × 5/9 = 0°C).
 */

import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Program7 temp = new Program7();
        temp.temperature();
    }

    void temperature() {
        Scanner tempF = new Scanner(System.in);
        System.out.print("Enter temperature in Fahrenheit: ");
        double f = tempF.nextDouble();
        double c = ((f - 32) * 5 / 9);
        System.out.println("The temperature in Celsius is:  " + c);
        tempF.close();
    }
}
