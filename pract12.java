//Added give digit to each digit of given number
public class pract12{
    int magic(int x,int n){
        int power=0;
        int sum=0;
        int a=0;
           while(x>0){
        int digit=x%10;
        int added=(digit + n)%10;
         a+=added * Math.pow(10,power);
          power++;
        x=x/10;
       
        

           }
           return a;

    }
    public static void main(String[] args){
    pract12 p=new pract12();
    int q=p.magic(32,3);
    System.out.print(q);
    }
}