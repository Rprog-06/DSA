import java.util.*;
public class pract2{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the size of array");
    int size=sc.nextInt();
    int [] arr=new int[size];
    for(int i=0;i<size;i++){
        arr[i]=sc.nextInt();
    }
    int max=arr[0];
    int min_index=0;
    for(int i=0;i<size;i++){
        if(arr[i]>max){
            max=arr[i];
           min_index=i;

        }
    }
    System.out.println("Maximum element is"+max);
     System.out.println("Maximun index is"+min_index);
    int min=arr[0];
    int max_index=0;
    for(int i=0;i<size;i++){
        if(arr[i]<min){
            min=arr[i];
            max_index=i;
        }
    }
    System.out.println("Minimum element is"+min);
    System.out.println("Minimum index is"+max_index);
    //Addition of maximum and minimum
   
    }
}