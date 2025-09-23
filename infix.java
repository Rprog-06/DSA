import java.util.Stack;
public class infix {
    static int priority(char c){
        switch(c){
            case '+':case'-': return 1;
            case '*'    :case'/': return 2;
            case '^': return 3;
            default: return -1;

        }
    }
    public static void main(String args[]){
        String s="a+b*(c^d-e)^(f+g*h)-i";
        String result="";
        java.util.Stack<Character> st=new java.util.Stack<>();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(Character.isLetterOrDigit(c)){
                result+=c;
            }
            else if(c=='('){
                st.push(c);
            }
            else if(c==')'){
                while(!st.isEmpty() && st.peek()!='('){
                    result+=st.pop();
                }
                if(!st.isEmpty() && st.peek()!='('){
                    System.out.println("Invalid Expression");
                }
                else{
                    st.pop();
                }
            }
            else{
                while(!st.isEmpty() && priority(c)<=priority(st.peek())){
                    result+=st.pop();
                }
                st.push(c);
            }

        }
        while(!st.isEmpty()){
            if(st.peek()=='('){
                System.out.println("Invalid Expression");
            }
            result+=st.pop();
        }
        System.out.println(result);

    }
}
