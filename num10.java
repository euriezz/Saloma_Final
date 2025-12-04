
/**
 * Write a description of class num10 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class num10
{
     public static void findFirstEvenIndex() {
        int[] array = {1, 3, 5, 8, 9};
        int index = -1;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                index = i;
                break;
            }
        }
        
        if (index != -1) {
            System.out.println("The first even number is at index: " + index);
        } else {
            System.out.println("No even numbers found in the array.");
        }
    }
}