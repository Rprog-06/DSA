import java.util.*;
public class charcount{
    public static void main(String[] args){
        HashMap<Character,Integer>mp=new HashMap<>();
        String s="programming";
        for(char c:s.toCharArray()){
            if(mp.containsKey(c)){
                mp.put(c,mp.getOrDefault(c, 0)+1);
            }
            else{
                mp.put(c,1);
            }
             
        }
        //First non-repeating character
        System.out.println(mp);

       
    

    }
}