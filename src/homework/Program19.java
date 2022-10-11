package homework;
/* A Java program to convert a given string into lowercase.
Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
Output: the quick brown fox jumps over the lazy dog.
 */

import java.util.Scanner;

public class Program19 {

    public static void main(String[] args) {
        Program19 fox = new Program19();
        fox.brownFox();
    }
    void brownFox(){
        Scanner story = new Scanner(System.in);
        System.out.println("Sample Input: ");
        String brown = story.nextLine();
        System.out.println("Output: " +(brown.toLowerCase()));
        story.close();
    }
}
