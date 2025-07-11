public class pract27{
    public static void main(String args[]){
         int P1=30;    //Common between P1 and P2
         int P2=26;    //Common between P2 and P3
         int P3=28;   // common between P1 and P3
         int Q=14;   //Common to solve all problems
         int R=43;  //Not participated
         int ALL=345;
         int ALLsolved=ALL-R+2*Q-P1-P2-P3;
         int particular=ALLsolved/3;
         System.out.println(ALLsolved);
        System.out.println(particular);
        int first=ALL-R+2*Q+P1+P3;
        System.out.println(first);


    }}