class Counter{
    private int val;
    public void counter(){
        val=0;
        }
    public void inc(){
        val++;
    }
    public void reset(){
        val=0;
    }
    public int getval(){
        return val;
    }
}




public class MyNumber{
 public static void main(String args[]){
     Counter c = new Counter();
     for(int i=0;i<5;i++){
         while(c.getval()<10){
             c.inc();
             System.out.println(c.getval());
         }
         c.reset();
     }
 }
}
