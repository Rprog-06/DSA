public class pract61{
    public static void main(String[] args) {
        int arr[]={1,3,-1,-3,5,3,6,7};
        int k=3;
        int j=0;
        
        while(j <= arr.length-k){
            int max=Integer.MIN_VALUE;
        for (int i = j; i < j+k; i++) {
           max=Math.max(arr[i],max);
          
           
          

        }
         System.out.print(max+" " );
        j++;
        
        }
    }
}