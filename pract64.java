
import java.lang.reflect.Array;
import java.util.Arrays;

public class pract64{
    public static void main(String[] args) {

        int monster=2;
        int power=123;
      int exp[]={78,130,};
      int bonus[]={10,0,};
      int count=0;
    
      for (int i = 0; i < exp.length; i++) {

          if(exp[i]<=power){
            power+=bonus[i];
            count++;
            
      }
       
      }
      System.out.println(count);
}
}