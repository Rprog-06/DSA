import java.util.*;
public class qwe{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        LinkedList<String>li=new LinkedList<>();
        int a=sc.nextInt();
        for (int i = 0; i < a; i++) {
            li.add(sc.next());
        }
       String q=sc.next();
       li.removeIf(s->s.compareTo(q)<=0);
       System.out.print(li);
     
    }
}