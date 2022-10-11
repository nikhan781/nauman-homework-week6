package homework;
/* A Java program to display the following pattern.
Sample Pattern :
J a v v a
J a a v v a a
J J aaaaa V V aaaaa
 */

public class Program11 {
    public static void main(String[] args) {
        Program11 pattern = new Program11();
        pattern.line1();
        line2();
        pattern.line3();

    }

    void line1() {
        System.out.println("J a v v a");

    }

    static void line2() {
        System.out.println("J a a v v a a");
    }

    void line3() {
        System.out.println("J J aaaaa V V aaaaa");
    }
}
