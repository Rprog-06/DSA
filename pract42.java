import java.util.*;
public class pract42{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        int arr[]=new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        for(int i=0;i<4;i+=2){
            System.out.print(arr[i]);
            sum+=arr[i];
        }
        System.out.println("Sum is"+sum);



    }
}