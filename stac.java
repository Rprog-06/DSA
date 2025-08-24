import java.util.*;
public class stac{
    public static void main(String[] args){
        Stack<Character>st=new Stack<>();
        String s="10100";
        for(char c:s.toCharArray()){
          if(!st.isEmpty()){
            if(st.peek()=='1' && c=='0' || st.peek()=='0' && c=='0'){
               st.pop();
            }
            else{
                st.push(c);
            }
           
          }
           else{
              st.push(c);  
            }
        }
        if(st.empty())
        {
            System.out.print("Valid");
        }
       else{
        System.out.print("Invalid");
       }

    }
}