public class pract38{
    public static void difference(int n1,int n2,int n3){
        System.out.println(smallest(n3)+smallest(n2)+smallest(n1)-largest(n3)+largest(n2)+largest(n1));
    }
    public static int smallest(int n){
        int smallest=Integer.MAX_VALUE;
        while(n>0){
            int digit=n%10;
            smallest=Math.min(smallest,digit);
            n=n/10;
        }
        return smallest;

    }
    public static int largest(int n){
        int largest=Integer.MIN_VALUE;
        while(n>0){
            int digit=n%10;
            largest=Math.max(largest,digit);

            n=n/10;
        }
        return largest;
        }
        public static void main(String[] args) {
             difference(123,456,789); 
        }
      

    }
