package homework;
/* A Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected Output:
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20
 */

public class Program14 {
   float width = 5.6f;
    float height = 8.5f;

    public static void main(String[] args) {
        Program14 result = new Program14();
        result.area();
        perimeter();

    }
    void area() {
        System.out.printf("Area is 5.6 * 8.5 = " +width*height);
    }
    static void perimeter() {
        Program14 pMeter = new Program14();
        float p = (2 * (pMeter.width + pMeter.height));
        System.out.println("Perimeter is 2 * (5.6 + 8.5) = " +p);
    }

}


