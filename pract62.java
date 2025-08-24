public class pract62{
    public static void main(String[] args){
        String lat="babbeddcs";
        int n1=lat.length()-1;
       String lon="aeeaecacw";
       int n2=lon.length()-1;
       int m=0;
       int h=0;
       int g=0;
       
      
        
        int maxFreq=0;
        int minFreq=0;
       
      for(int i=0;i<lat.length()-2;i++){
         int cnt=0;
        for(int j=i+1;j<lat.length()-2;j++){
           if(lat.charAt(i)==lat.charAt(j)){
            cnt++;
            
           
           }
           
          
        }
         maxFreq = Math.max(maxFreq, cnt);
         minFreq=Math.min(minFreq,cnt);
        
        
     
        
      }
      System.out.print(maxFreq-minFreq);
        if(lat.charAt(n1)=='s'){
            System.out.print("South");
        }
        else if(lat.charAt(n1)=='n'){
            System.out.print("North");
        }
      int maxFre=0;
      int minFre=Integer.MAX_VALUE;
      
         for(int i=0;i<lon.length()-2;i++){
         int cont=0;
        for(int j=i+1;j<lon.length()-2;j++){
           if(lon.charAt(i)==lon.charAt(j)){
            cont++;
            
           
           }
           
          
        }
         maxFre = Math.max(maxFre, cont);
          if (cont > 1)
                minFre = Math.min(minFre, cont);
        
        
     
        
      }
       System.out.print(maxFre-minFre);
        if(lon.charAt(n2)=='e'){
            System.out.print("East");
        }
        else{
            System.out.print("West");
        }
    
    
    }
}