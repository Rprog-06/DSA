import java.util.Scanner;
public class pract10{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Enter a string:");
        String str=sc.nextLine();
        String c=str.toUpperCase();
       Character a=c.charAt(0);
       Character b=c.charAt(str.length()-1);
       System.out.println("First character: " +a);
      

    }
}