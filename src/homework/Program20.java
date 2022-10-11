package homework;
/* A Java Program to print as below.
"+------------------------+"
"|                        |"
"| CORNER STORE           |"
"|                        |"
"| 2015-03-29 04:38PM     |"
"|                        |"
"| Gallons: 10.870        |"
"| Price/gallon: $ 2.089  |"
"|                        |"
"| Fuel total: $ 22.71    |"
"|                        |"
"+------------------------+"
 */

import java.util.Scanner;

public class Program20 {
    public static void main(String[] args) {
        Program20 fuel = new Program20();
        fuel.fuelReceipt();
    }

    void fuelReceipt() {
        Scanner receipt = new Scanner(System.in);
        System.out.print("Gallons: ");
        float gal = receipt.nextFloat();
        float gprice = 2.089f;
        float total = gal * gprice;
        float totalRoundOff = (float) Math.round(total * 100) / 100;
        System.out.println(" \"+-------------------------+\" ");
        System.out.println(" \"|                         |\" ");
        System.out.println(" \"|      CORNER STORE       |\" ");
        System.out.println(" \"|                         |\" ");
        System.out.println(" \"| 2015-03-29  04:38PM     |\" ");
        System.out.println(" \"|                         |\" ");
        System.out.println(" \"| Gallons:  " + gal + "         |\" ");
        System.out.println(" \"| Price/gallon: $" + "" + gprice + "    |\" ");
        System.out.println(" \"|                         |\" ");
        System.out.println(" \"| Fuel total:  $" + totalRoundOff + "     |\" ");
        System.out.println(" \"|                         |\" ");
        System.out.println(" \"+-------------------------+\" ");
        receipt.close();


    }
}
