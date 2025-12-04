import java.util.Scanner;

/**
 * Write a description of class num15 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class num15
{
     public static void main(String [] args){
      Scanner in = new Scanner(System.in);  
     int[] arr = new int[5];

        System.out.println("\n\nEnter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println("Numbers > 50:");
        for (int n : arr) {
            if (n > 50) System.out.print(n + " ");
        }
    }

}