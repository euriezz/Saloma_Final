
/**
 * Write a description of class num8 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class num8
{
   public static void copyArrayAToB() {
        int[] arrayA = {1, 2, 3, 4, 5};
        int[] arrayB = new int[arrayA.length];
        
        for (int i = 0; i < arrayA.length; i++) {
            arrayB[i] = arrayA[i];
        }
        
        System.out.print("Copied array: ");
        for (int num : arrayB) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}