import java.util.Scanner;

/**
 * Write a description of class num9 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class num9
{
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int input;
        
        do {
            System.out.print("Enter a number (or 0 to stop): ");
            input = scanner.nextInt();
            sum += input;
        } while (input != 0);
        
        System.out.println("The sum is: " + sum);
    }
}
