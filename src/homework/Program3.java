package homework;
/* A Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the
print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.
 */

public class Program3 {
    int iVar = 100;
    static String sVar = "Price of phone is ";

    public static void main(String[] args) {
        Program3 twoVar = new Program3();
        twoVar.myInstant();
        myStatic();

    }

    void myInstant() {
        System.out.print(sVar);
        System.out.println(iVar);
    }

    static void myStatic() {
        Program3 statVar = new Program3();
        System.out.print(sVar);
        System.out.print(statVar.iVar);


    }
}