 class Adder{
    private double val;

    public Adder(){
        val = 0.0;
    }

    public void add(double v){
        val += v;
    }

    public void addFrom(Adder another){
        val += another.getVal();
    }

    public void setVal(double v){
        val = v;
    }

    public double getVal(){
        return val;
    }

    public void reset(){
        val = 0.0;
    }
}
public class AdderTest{
    public static void main(String[] args) {
        Adder a = new Adder();
        a.add(2);
        a.add(3);
        System.out.println(a.getVal());

        Adder b = new Adder();
        b.setVal(12);
        b.add(1);
        System.out.println(b.getVal());

        a.addFrom(b);
        System.out.println(a.getVal());
    }
}