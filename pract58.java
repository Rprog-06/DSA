public class pract58{
  public static void main(String[] args) {
      int arr[]={1,5,4};
      int up=1;
      int down=1;
      for(int i=1;i<arr.length;i++){
        if(arr[i]>arr[i-1]){
           up=down+1;
        }
        else if(arr[i]<arr[i-1]){
            down=up+1;
        }
        
      }
      System.out.println(Math.max(up,down));
  }  
}