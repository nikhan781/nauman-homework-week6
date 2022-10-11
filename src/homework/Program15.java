package homework;
/* A Java program to swap two variables.
 */

import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {
        Program15 numSwap = new Program15();
        numSwap.beforeSwap();
    }
    void beforeSwap() {
        System.out.println("Before swap : ");
        Scanner swap = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        int a = swap.nextInt();
        System.out.println("a = " + a);
        System.out.print("Enter 2nd number: ");
        int b = swap.nextInt();
        System.out.println("b = " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap : ");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        swap.close();
    }
}
