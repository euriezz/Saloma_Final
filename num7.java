
/**
 * Write a description of class num7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class num7
{
    public static void main(String [] args) {
        int[] array = {-1, 2, -3, 4, -5};
        
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                array[i] = -array[i];
            }
        }
        
        System.out.print("Modified array: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
