package homework;
/* A program for a calculator with addition, subtraction, multiplication
and division methods all with parameters and use string concatenation
methods.(Note: Two static and Two instance methods.)
 */

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        Program5 cacl = new Program5();
        Scanner add = new Scanner(System.in);
        System.out.print("Enter 1st no : ");
        double no1 = add.nextDouble();
        char operator = add.next().charAt(0); //Entre operator after 1st number
        System.out.print("Enter 2nd no : ");
        double no2 = add.nextDouble();
        if (operator == '+') {
            cacl.addition(no1, no2);
        }
        if (operator == '-') {
            cacl.subtraction(no1, no2);
        }
        if (operator == '*') {
            multiply(no1, no2);
        }
        if (operator == '/') {
            division(no1, no2);
        }
        add.close();

    }

    void addition(double no1, double no2) {
        System.out.println(no1 + no2);
    }

    void subtraction(double no1, double no2) {
        System.out.println(no1 - no2);

    }

    static void multiply(double no1, double no2) {
        System.out.println(no1 * no2);

    }

    static void division(double no1, double no2) {
        System.out.println(no1/no2);
    }

}

