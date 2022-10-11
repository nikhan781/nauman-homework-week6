package homework;
/* A Java programme using the following steps.
2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print statement.
2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme.
 */

public class Program2 {
    static int sVar1 = 10;
    static String sVar2 = "My score is ";

    public static void main(String[] args) {
        myStaticVariables();
    }

    static void myStaticVariables() {
        System.out.print(sVar2);
        System.out.println(sVar1);
    }

}
