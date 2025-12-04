import java.util.Scanner;

/**
 * Write a description of class num18 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class num18
{
   public static void main(String [] args){
      Scanner in = new Scanner(System.in);  
       int[] arr = {3, 8, 2, 8, 5};
        boolean dup = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) dup = true;
            }
        }

        System.out.println("\nContains duplicate? " + dup);
    }

}