
/**
 * Write a description of class num4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class num4
{
    public static void findSmallestAndLargest() {
        int[] array = {5, 2, 9, 1, 5, 6};
        int smallest = array[0];
        int largest = array[0];
        
        for (int i = 1; i < array.length; i++) {
            if (array[i] < smallest) {
                smallest = array[i];
            }
            if (array[i] > largest) {
                largest = array[i];
            }
        }
        
        System.out.println("Smallest: " + smallest + ", Largest: " + largest);
    }
}