import java.util.*;
public class easy {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int arr[]={1,2,5,10,20,50,100,500,1000};
        int count=0;
        for(int i=arr.length-1;i>=0;i--){
            int coin=arr[i];
            if(n>=coin){
                 count+=n/coin;
                n=n%coin;
            }
        }
        System.out.println(count);
    }


    
}
