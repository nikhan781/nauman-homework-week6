package homework;
/* A Java program to compute the specified expressions and print the
output.
Test Data:
((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
Expected Output : 2.138888888888889
 */

public class Program12 {
    double a = 25.5;
    double b = 3.5;
    double c = 40.5;
    double d = 4.5;

    public static void main(String[] args) {
        expression();
    }

    static void expression() {
        Program12 print = new Program12();
        System.out.println("Test Data:");
        System.out.println("(25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)");
        System.out.print("Expected Output : ");
        System.out.println((print.a * print.b - print.b * print.b) / (print.c - print.d));
    }
}
