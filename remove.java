import java.util.*;
public class remove{
    public static String remove(String abc,int index,StringBuilder result){
      if(index==abc.length()){
        return result.toString();
      }
      if(result.length()==0||abc.charAt(index) != result.charAt(result.length()-1)){
        result.append(abc.charAt(index));
      }
        return remove(abc, index + 1, result);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String abc=sc.nextLine();
        StringBuilder result = new StringBuilder();
        String ans=remove(abc, 0, result);
        System.out.print(ans);
    }
}