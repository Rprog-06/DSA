public class pract59{
    public static void main(String[] args) {
        //Finding maximum sub array in array
        //Through sliding window algorithm
        int arr[]={5,2,-1,0,3};
        int sum=0;
        int k=3;
        int ma=0;
       
        for(int i=0;i<k;i++){
            sum+=arr[i];
          
        }
        int mathsum=sum;
        for (int i = k; i < arr.length; i++) {
            sum+=arr[i]-arr[i-k];
            mathsum=Math.max(mathsum,sum);
        }
        System.out.println("Maximum subarray sum: " + mathsum);
    }
}