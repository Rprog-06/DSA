public class pract1{
   static int top=-1;
    static void push(int x,int []arr){
      
     
      if(top==5){
        System.out.print("Stack is full");

      }
      else{
        top++;
        arr[top]=x;
        
        System.out.println("Pushed successfully"+x);
      }


    }
    void pop(int arr[]){
      
        int x=arr[top];
        System.out.println(x);
        top--;
        //  x=arr[top--];



        
    }
    void peek(int arr[]){
        System.out.println("the top elements is"+arr[top]);
    }
    public static void main(String[] args) {
          int []arr=new int[5];
        pract1 p=new pract1();

        p.push(5,arr);
        p.push(10,arr);
        p.push(15,arr);
        System.out.println("The element popped is");
         p.pop(arr);
         System.out.println("The elements are");
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
            
        }
        p.peek(arr);
    }


}