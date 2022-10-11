package homework;
/* A program to calculate the area of a triangle.
 */

import java.util.Scanner;

public class Program8 {
    public static void main(String[] args) {
        Program8 areaOfTriangle = new Program8();
        areaOfTriangle.myTriangle();
    }

    void myTriangle() {
        Scanner triangle = new Scanner(System.in);
        System.out.print("Enter height: ");
        double h = triangle.nextDouble();
        System.out.print("Enter base: ");
        double b = triangle.nextDouble();
        double area = ((h * b) / 2);
        System.out.println("The area of triangle is: " + area);
        triangle.close();
    }
}
