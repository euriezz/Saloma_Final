
/**
 * Write a description of class num3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class num3
{
    public static void main(String [] args) {
        int numLines = 5;
        
        for (int i = 1; i <= numLines; i++) {
            for (int j = 1; j <= numLines - i; j++) {
                System.out.print(" ");
            }
            
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            
            System.out.println();
        }
    }
}
