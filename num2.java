
/**
 * Write a description of class num2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class num2
{
    public static void countSevens() {
        int[] array = {1, 7, 3, 7, 5, 7, 8, 7, 9, 7};
        int count = 0;
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 7) {
                count++;
            }
        }
        
        System.out.println("The number 7 appears " + count + " times.");
    }
}