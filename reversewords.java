public class reversewords{
    public static void main(String[] args){
        String a="this is very java  ";
        StringBuilder ans=new StringBuilder();
        int i=a.length()-1;
        while(i >=0){
        while(i>=0 && a.charAt(i)==' '){
            i--;

        }

        if(i<0) break;
        int end=i;
        while(i>=0 && a.charAt(i) !=' '){
            i--;
        }
        int start=i+1;
        ans.append(a.substring(start, end+1));
        ans.append(" ");


    }
    System.out.print(ans.toString().trim());


    }
}