import java.util.Scanner;

/**
 * Write a description of class num19 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class num19
{
    public static void main(String [] args){
      Scanner in = new Scanner(System.in);  
      String[] names = {"Ana", "Mark", "Luis"};
        int[] grades = {90, 85, 78};

        System.out.println("\nName - Grade:");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " = " + grades[i]);
        }
    }

}