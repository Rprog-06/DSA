public class home2 {

    // Function to reverse a number
    public static int reverse(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + num % 10;
            num /= 10;
        }
        return rev;
    }

    // Function to check if a number is a palindrome
    public static boolean isPalindrome(int num) {
        return num == reverse(num);
    }

    // Main logic to generate palindrome
    public static int generatePalindrome(int num) {
        while (!isPalindrome(num)) {
            int rev = reverse(num);
            num = num + rev;
        }
        return num;
    }

    public static void main(String[] args) {
        int input = 195;
        int result = generatePalindrome(input);
        System.out.println("Palindrome is: " + result);
    }
}
