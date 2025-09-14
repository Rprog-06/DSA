
public class triangle {
   public static void main(String[] args){
    // int n=5;
    // for(int i=1;i<=n;i++){
    //     for(int j=i;j<n;j++){
    //         System.out.print(" ");
    //     }
    //     for(int j=1;j<=(2*i-1);j++){
    //         if(j==1||j==(2*i-1)||i==n){
    //             System.out.print("A");
    //         }
    //         else{
    //             System.out.print(" ");
    //         }

    //     }
    //     System.out.println();

    // }
    int n=5;
    for(int i=1;i<=n;i++){
        for(int j=i;j<n;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=(2*i-1);j++){
           
                System.out.print("A");

            }
System.out.println();
        }
        for(int i=n-1;i>1;i--){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int j=1;j<(2*i-1);j++){
                System.out.print("A");
            }
            System.out.println();
        }
       
        // for(int i=2;i<=n;i++){
        //     for(int j=i;j<n;j++){
        //         System.out.print(" ");

        //     }
        //     for(int j=1;j<(2*i-1);j++){
        //         System.out.print("A");
        //     }
        //     System.out.println();
        // }

        

   }    
}
