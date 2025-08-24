import java.util.*;
public class LargestCoin{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
       
        while (t-- > 0) {
        int n=sc.nextInt();
        String coin[]=new String[n];
        for(int i=0;i<n;i++)
        {
            coin[i]=sc.next();
        }
            Arrays.sort(coin,(a,b)->(b+a).compareTo(a+b));
            if(coin[0].equals("0")){
                System.out.print("0");
            }
            else{
                StringBuilder sb=new StringBuilder();
                for(String s:coin){
                   sb.append(s);
                  System.out.println(sb.toString());  
                }
              
            }
            

        }

    }
}