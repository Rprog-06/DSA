import  java.util.*;
public class pract14{
    int linearsearch() {
      Scanner sc=new Scanner(System.in);
      System.out.print("ENTER target number");
      
      int target=sc.nextInt();
       System.out.print("ENTER size of array : ");
       int n = sc.nextInt();
      int [] arr=new int[n];
       
       
      for(int i=0;i<arr.length;i++){
          System.out.print("ENTER element "+(i+1)+" : ");
          arr[i]=sc.nextInt();
      }
      for (int i = 0; i < arr.length; i++) {
          if (arr[i] == target) {
              return i;
          }
      }
      return -1;

   
    }
    public static void main(String[] args) {
        pract14 p = new pract14();
        int result = p.linearsearch();
       
        if (result == -1) {
            System.out.println("Element not found in the array.");
        }
        else {
            System.out.println("Element found at index: " + result);
        }
    }
}     
