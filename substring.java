import java.util.*;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.html.HTMLDocument;
public class substring{
    static ArrayList<Integer>li=new ArrayList<>();
    public static void substring(int index,String text,String target){
        if(index>text.length()-target.length()){
            return;
        }
        if(text.substring(index, index+target.length()).equals(target)){
          li.add(index);
        }
        substring(index+1,text,target);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String text=sc.next();
        String target=sc.next();
        substring(0, text, target);
        if(li.isEmpty()){
            System.out.println("No substring found");
        }
        else{
            System.out.println(li);
        }

    }


}