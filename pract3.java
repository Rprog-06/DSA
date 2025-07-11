import java.util.Scanner;
public class pract3{
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size=sc.nextInt();
        int [] arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        int j=0;
        for(int i=0;i<size;i++){
            if(arr[i]%10==0){
                 j=i;
                break;
            }

        }
        for(int i=j+1;i<size;i++){
            if(arr[i]%10!=0){
                
            
            int temp=arr[i];

            arr[i]=arr[j];
            arr[j]=temp;
            j++;
            }
        }
        for(int i=0;i<size;i++){
            System.out.print(arr[i]+" ");
        }

    }
}