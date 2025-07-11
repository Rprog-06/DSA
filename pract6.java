import java.util.*;
public class pract6{
    void rec(int n){
    if(n<=0){
        return;}
       String s="Hello World";
       System.out.println(s);
       rec(n-1);
      
    }
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Times to print");
        int n=sc.nextInt();
       
            pract6 p=new pract6();
            p.rec(n);
        
      
}
}