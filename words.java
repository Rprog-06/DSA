public class words{
    public static void main(String[] args) {
        String str="hello    world    java   vb";
        
        int words=0;

       for(int i=0;i<str.length();i++){
        int cnt=0;
        if(str.charAt(i)==' '){
            cnt++;
        }
        if(cnt>=1){
            words++;
            
        }
    

       }
       System.out.print(words);
    }
}