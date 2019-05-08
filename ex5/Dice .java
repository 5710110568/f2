public class Dice
{
    private int value;

    public Dice()
    {
        value = 1;
    }

    public void roll()
    {
        value = (int)(Math.random()*6)+1; //dice's point
    }
    public int getValue()
    {
        return value;
    }
}