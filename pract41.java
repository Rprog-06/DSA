import java.util.*;
public class pract41{
    static int peak(){
     Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i]=sc.nextInt();
        }
        for (int i = 1; i < 4; i++) {
            if(arr[i-1]<arr[i] && arr[i]>arr[i+1])
            {
                return i;
            }
        }
        return -1;

    }
    public static void main(String[] args){
       int a=peak();
       System.out.println(a);
}
}