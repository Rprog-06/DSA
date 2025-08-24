
import java.util.ArrayList;
import java.util.*;

public class rty{
    public static int longestword(String words[],int index,int max){
        if(index==words.length){
            return max;
        }

        int current=words[index].length();
        if(current>max){
            max=current;
        }
        return longestword(words,index+1,max);
       

    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String abc=sc.nextLine();
        String answer[]=abc.split(" ");
        int len=longestword(answer, 0, 0);
        System.out.print(len);

        

    }
}