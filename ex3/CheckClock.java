 class Clock
{
    private int hh,mm,state;

    public Clock(int h, int m)
    {
        hh = h;
        mm = m;
        state = 0;
    }

    public void pressCenter(boolean longPress)
    {
        if(longPress)
        {
            if(state ==0) //first longpress
            {
                state = 1;
            }
            else
            {
                state = 0;//second longpress -->out
                //printTime();
            }
        }
        else //shortpress
        {
            switch(state){
                case  1:
                 state = 2; break;
                case 2 :
                 state = 1; break;
            }
                
        }
        

    }

    public void up()
    {
        if(state ==1)
        {
            hh++;
        }
        if(state ==2)
        {
            mm++;
        }
    }

    public void down()
    {
        if(state ==1)
        {
            hh--;
        }
        if(state ==2)
        {
            mm--;
        }
    }

    public void printTime()
    {
        System.out.println(hh + ":" + mm);
    }


}
public class CheckClock
{
    public static void main(String args[])
    {
        Clock c = new Clock(12, 35);

        c.pressCenter(true);
        c.up();
        c.up();
        c.pressCenter(false);
        c.up();
        c.up();
        c.up();
        c.up();
        c.up();
        c.pressCenter(true);
        c.printTime(); //14:40
    }
}