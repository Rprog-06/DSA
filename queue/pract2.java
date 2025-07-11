import  java.util.*;
public class pract2{
    static Stack<Integer>st=new Stack<>();
    static Stack<Integer>a=new Stack<>();     //Implementing queue using stack
    public static void main(String[] args) {
        st.push(10);
          st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
         System.out.println("Elements in stack are:");
        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
         st.push(10);
          st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);

        a.push(st.pop());
        a.push(st.pop());
        a.push(st.pop());
        a.push(st.pop());
        a.push(st.pop());
        System.out.println("Elements in queue are:");
      for(int i=0;i<a.size();i++){
            System.out.print(a.get(i)+" ");
        }
        System.out.println();
       
        System.out.println();
        System.out.println("Size of stack is: "+st.size());
        System.out.println("Size of queue is: "+a.size());
        System.out.println("Is stack empty? "+st.isEmpty());
        System.out.println("Is queue empty? "+a.isEmpty());
        


    }
  

}