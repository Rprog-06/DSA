public class adjastring {
 public static void main(String[] args){
    String s="Computer";
    char a[]=s.toCharArray();
    for(int i=0;i<a.length;i+=2){
        char temp=a[i];
        a[i]=a[i+1];
        a[i+1]=temp;
    }
    System.out.print(a);
 }   
}
