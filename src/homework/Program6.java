package homework;
/* A program to enter any radius value of the circle and find out the
area.(Formula of Area A=PI*r*r).
 */

import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        myCircle();
    }

    static void myCircle() {
        Scanner area = new Scanner(System.in);
        System.out.print("Entre radius of circle: ");
        double r = area.nextDouble();
        double A = (3.14 * r * r);
        System.out.print("Area of circle is: " + A);
        area.close();

    }
}
