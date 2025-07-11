
import java.util.Scanner;

public class pract11 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter string");
    String b=sc.nextLine();
        pract11 p = new pract11();
        int a = p.isPalindrome(b, 4);
        System.out.println(a);
    }

    int isPalindrome(String str, int n) {

        char[] ch = str.toCharArray();
        int left = 0;
        int right = n - 1;
        while (left < right) {
            if (ch[left] == ch[right]) {
                left++;
                right--;

            } else {
                return 0;
            }

        }
        return 1;

    }
}
