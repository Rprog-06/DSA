public class pract73{
    public static void main(String[] args){
        String chars[]={"flying","fly","flew"};
        String prefix=chars[0];
        for(int i=1;i<chars.length;i++){
            while(chars[i].indexOf(prefix) != 0){
                prefix=prefix.substring(0, prefix.length()-1);
            }

        }
        System.out.println(prefix);
    }
}