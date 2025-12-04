import java.util.*;

/**
 * Write a description of class num14 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class num14
{
    public static void main(String [] args){
      Scanner in = new Scanner(System.in);  
     int[] grades = {80, 65, 90, 72, 88};
        int pass = 0, fail = 0;

        for (int g : grades) {
            if (g >= 75) pass++;
            else fail++;
        }

        System.out.println("\nPass: " + pass + ", Fail: " + fail);
    }
}

