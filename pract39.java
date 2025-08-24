
import java.util.Scanner;

public class pract39 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        int j = 0;
        for (int i = 0; i < 5; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }

        }
        for (int i = j+1; i < 5; i++) {
            if(arr[i] != 0){
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j++;
            }
        }
        for(int i=0;i<5;i++){
            System.out.print(arr[i]);
        }

    }
}
