public class Tunnel
{
    private int slotIn;
    private int slotout;

    public Tunnel(int s_in, int s_out)
    {
        slotIn = s_in;
        slotout = s_out;
    }

    public int walkIn(int num)
    {
        if(num == slotIn)
        {
            return slotout; // entry tunnel
        }
        else
        {
            return num; // not entry tunnel
        }

    }

}