public class  pract63{
    public static void main(String[] args) {
        int arr[]={-2,-3,4,-1,-2,1,5,-3};
        int max=0;
        int maxi=0;
        for (int i = 0; i < arr.length; i++) {
             max=max+arr[i];
             if(maxi<max){
                maxi=max;
             }
             if(max<0){
                max=0;
             }

        }
        System.out.print(maxi);
    }
}