import java.util.Scanner;

/**
 * Write a description of class numb1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class numb1
{
     public static void getNumberBetween1And100() {
        Scanner scanner = new Scanner(System.in);
        int number;
        
        do {
            System.out.print("Enter a number between 1 and 100: ");
            number = scanner.nextInt();
        } while (number < 1 || number > 100);
        
        System.out.println("You entered a valid number: " + number);
    }
}