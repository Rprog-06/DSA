public class pract34{
    public static void main(String[] args){
        int arr[]={12,16,10,7,13,3,9};
        int count=0;
        for (int i = 0; i < 7; i++) {
            for (int j= i+1; j< 7; j++)
            {
                if(arr[i]>arr[j]){
             int temp=arr[i];
             arr[i]=arr[j];
             arr[j]=temp;
               count++;   
                }
            }
           
            
        }
        System.out.println(count);
    }
}