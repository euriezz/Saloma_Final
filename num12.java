import java.util.Scanner;

/**
 * Write a description of class num12 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class num12
{
   public static void main(String [] args){
      Scanner in = new Scanner(System.in);  
      int[] arr = {3, 7, 7, 2, 7};
        int target = 7, count = 0;

        for (int n : arr) {
            if (n == target) count++;
        }

        System.out.println("\n\n7 appears at least 3 times? " + (count >= 3));

    }

}