public class pract67{
    static void subsets(){
          int arr[]={1,2,3};
        for (int i = 0; i < 3; i++) {
           System.out.print(arr[i]+ " ");
          
        }
         subsets();
    }
    
    public static void main(String[] args) {
     subsets();       
    }
}