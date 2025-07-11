
import java.util.Scanner;

public class pract30 {

    public static int saveThePrisoner(int n, int m, int s) {
        return ((s - 1 + m - 1) % n) + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Number of test cases
        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt();

        for (int i = 0; i < t; i++) {
            // Input: n = prisoners, m = candies, s = starting chair
            System.out.print("Enter n (prisoners), m (candies), s (starting chair): ");
            int n = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();

            // Output result
            int result = saveThePrisoner(n, m, s);
            System.out.println(result);
        }

        sc.close();
    }
}
