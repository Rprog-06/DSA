
import java.util.Scanner;

public class character{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String a=sc.next();
        StringBuilder b=new StringBuilder();
        
        int i=0;
        while(i<a.length()){
            if(i+1<a.length()){
                char first=a.charAt(i);
                char second=a.charAt(i+1);
                if(first<second){
                    b.append(second);
                }
                else{
                    b.append(first);
                }
                i+=2;
            }
            else{
                b.append(a.charAt(i));
                i++;
            }
        }
        System.out.println(b);

    }
}