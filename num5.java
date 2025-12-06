
/**
 * Write a description of class num5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class num5
{
    public static void main(String [] args) {
        int[] array = {1, 3, 5, 7, 9, 11};
        int targetValue = 7;
        boolean found = false;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == targetValue) {
                System.out.println("Found " + targetValue + " at index " + i);
                found = true;
                break;
            }
        }
        
        if (!found) {
            System.out.println(targetValue + " not found in the array.");
        }
    }
    
    }
