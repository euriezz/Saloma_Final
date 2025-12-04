import java.util.Scanner;

/**
 * Write a description of class num16 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class num16
{
    public static void main(String [] args){
      Scanner in = new Scanner(System.in);  
    System.out.print("\n\nEnter a number: ");
        int num = in.nextInt();
        int digits = String.valueOf(num).length();
        System.out.println("Digits: " + digits);
    }

}