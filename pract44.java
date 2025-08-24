
import java.util.*;

public class pract44 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of quizzes");
        int N = 3;
        int physics[] = {1, 4, 6};
        int chemistry[] = {1, 2, 3};
        int maths[] = {4, 8, 9};
        int Q = 2;
        int q = 2;
        if (q > N) {
            System.out.println(-1);
        } else {

            int ans = physics[q - 1] + chemistry[q - 1] + maths[q - 1];
            System.out.println("Result is " + ans);

        }

    }
}
