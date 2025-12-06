
/**
 * Write a description of class num6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class num6
{
    public static void main(String [] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 0;
        int count = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                sum += array[i];
                count++;
            }
        }
        
        if (count > 0) {
            double average = (double) sum / count;
            System.out.println("Average of odd numbers: " + average);
        } else {
            System.out.println("No odd numbers found in the array.");
        }
    }
}
