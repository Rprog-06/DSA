public class pract4{
   static int countspecific(int m,int n){
        int count=0;
        boolean flag=false;
        for(int i=m;i<=n;i++){
           int num=i;
           while(num>0)
           {
              if(num%10==1||num%10==4||num%10==9)
              {
                flag=true;
                num=num/10;
              }
              else
              {
                flag=false;
                break;
              }
           }
                
            if(flag==true){
            count++;
           }
           
           }

           
        
        return count;

    }
    public static void main(String[] args) {
        int s=countspecific(100,200);
        System.out.println(s);

    }
}