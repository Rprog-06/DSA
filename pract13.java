public class pract13{
    int magic(int x){
        int power=0;
        int sum=0;
        int a=0;
           while(x>0){
        int digit=x%10;
       sum+=digit;
       x=x/10;
       
        

           }
           return sum;

    }
    public static void main(String[] args){
    pract13 p=new pract13();
    int q=p.magic(32);
    System.out.print(q);
    if(10==10.0){
        System.out.println("Yes");
    }
    }
}