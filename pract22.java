 class abc{
    private int no=23;
  abc(int no){
  
  this.no=no;
  
  }
  public void display(){
      System.out.println(no);
  }
}
public class pract22{
    public static void main(String[] args) {
        abc x=new abc(45);
        x.display();


        
    }
}