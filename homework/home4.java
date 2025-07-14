import java.util.Scanner;

public class home4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        System.out.println(sumOfRotatablePrimes(start, end));
        scanner.close();
    }

    public static int sumOfRotatablePrimes(int start, int end) {
        int sum = 0;
        for (int num = start; num <= end; num++) {
            if (isPrime(num) && allRotationsPrime(num)) {
                sum += num;
            }
        }
        return sum;
    }

    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        int count=0;
        for (int i = 3; i  <= n; i++ ) {
            if (n % i == 0) {
                count++;
            }
            if (count > 1) return false; // More than one divisor means not prime
        }
        return true;
    }

    public static boolean allRotationsPrime(int num) {
        String s = Integer.toString(num);
        int len = s.length();
        
        // For single-digit numbers, only need to check the number itself
        if (len == 1) return true;
        
        // Check all rotations
        for (int i = 0; i < len; i++) {
            String rotated = s.substring(i) + s.substring(0, i);
            int rotatedNum = Integer.parseInt(rotated);
            if (!isPrime(rotatedNum)) {
                return false;
            }
        }
        return true;
    }
}