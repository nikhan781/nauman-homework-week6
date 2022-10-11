package homework;
/* A program to convert the upper case to lower case.
 */

import java.util.Scanner;

public class Program9 {
    public static void main(String[] args) {
        upperCase();
    }

    static void upperCase() {
        Scanner lCase = new Scanner(System.in);
        System.out.print("Enter Uppercase only: ");
        String phrase = lCase.next();
        System.out.println(phrase.toLowerCase());
        lCase.close();
    }
}
