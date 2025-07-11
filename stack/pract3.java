public class pract3{
   static int countdigitoccurences(int i,int u,int x){

         int count=0;
         for(int j=i;j<=u;j++){
            int y=j%10;
            int z=j/10;
            if(y==x){
                count+=1;
            }
            if(z==x){
                count++;
            }

         }
        return count;

    }
 public static void main(String[] args) {
     int i,u,x;
     int a=countdigitoccurences(2,89,3);
     System.out.println(a);
 }   
}