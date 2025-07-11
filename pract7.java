import java.util.Scanner;
public class pract7{
   static void wall(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no of interior walls");
        int interior=sc.nextInt();
        double cost=0;
         System.out.println("Enter the no of exterior walls");
        int exterior=sc.nextInt();
        for(int i=0;i<interior;i++){
            System.out.println("Enter the surface area of wall "+(i+1));
            double area=sc.nextDouble();
            cost+=18* area;
        }
        //xcmc
        // System.out.println("Total cost for interior walls: " + cost)
        //ffk
        // Calculate total cost for interior walls
        // double ecost = 0;
        
        

        
        // Calculate total cost for interior walls

        // System.out.println("Total cost for interior walls: " + cost);

       
      // Reset cost for exterior walls
        for(int i=0;i<exterior;i++){
            System.out.println("Enter the surface area of wall "+(i+1));
            double area=sc.nextDouble();
            cost+=12* area;
        }
        // System.out.println("Total cost for exterior walls: " + ecost);
        // double totalCost = cost + ecost;
         System.out.println("Total cost for all walls: " + cost+ " Rs");
    }
    public static void main(String [] args){
       
        wall();
    }
}