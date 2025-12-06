
/**
 * Write a description of class num13 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class num13 {
    public static void main(String[] args) {
        int[] grades = {80, 60, 90, 70, 85, 50};
        int passed = 0;
        int failed = 0;

        for (int grade : grades) {
            if (grade >= 75) {
                passed++;
            } else {
                failed++;
            }
        }

        System.out.println("Passed: " + passed + ", Failed: " + failed);
    }
}

