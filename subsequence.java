import java.util.*;
import javax.naming.spi.DirStateFactory;
public class subsequence{
    public static void subsequence(String str,int index,String current,List<String>li){
      Scanner sc=new Scanner(System.in);
     
     if(index==str.length()){
        li.add(current);
        return;
     }
    subsequence(str, index+1, current+str.charAt(index), li);
    subsequence(str, index+1, current, li);


    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.next();
        ArrayList<String>li=new ArrayList<>();
        subsequence(str, 0, "", li);
        for(String s:li){
            if(!s.equals("")){
                System.out.print(s+" ");
            }
        }

    }
}