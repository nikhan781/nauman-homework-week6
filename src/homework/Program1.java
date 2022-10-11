package homework;
/* A program to using following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement.
1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme.
 */

public class Program1 {
    int var1 = 10;
    int var2 = 20;

    public static void main(String[] args) {
        Program1 var = new Program1();
        var.myVariables();
    }

    void myVariables() {
        System.out.println(var1);
        System.out.println(var2);
    }
}
