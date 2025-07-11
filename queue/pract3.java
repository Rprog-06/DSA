import java.util.*;
public class pract3{
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    int x=sc.nextInt();
    int y=sc.nextInt();
     int z=sc.nextInt();
      int q=sc.nextInt();
     System.out.print(x + " ");
    
    if(y%3==0){
        System.out.print("THREE" + " ");
    }
   
    if(z%5==0){
        System.out.print("FIVE"+ " ");
    }
   
    if(q%3==0 && q%5==0){
        System.out.print("THREEFIVE" + " ");
    }

    }
    
}