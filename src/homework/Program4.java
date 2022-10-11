package homework;
/* A Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the
print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Program4 {
    int iVar1 = 10;
    int iVar2 = 30;
    static String sVar1 = " is";
    static String sVar2 = " less than ";

    public static void main(String[] args) {
        Program4 program4 = new Program4();
        program4.instMethod();
        statMethod();
    }
    void instMethod() {
        System.out.print(iVar2);
        System.out.print(sVar1 + " not");
        System.out.print(sVar2);
        System.out.println(iVar1);
    }
    static void statMethod() {
        Program4 statVar = new Program4();
        System.out.print(statVar.iVar1);
        System.out.print(sVar1);
        System.out.print(sVar2);
        System.out.print(statVar.iVar2);
    }
}
