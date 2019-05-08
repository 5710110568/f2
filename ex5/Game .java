import java.util.ArrayList;

public class Game
{
    private int win;
    private int turn;
    private int play1;
    private int play2;
    private Dice dice1;
    private Dice dice2;
    private ArrayList<Tunnel> tunnels; // tunnels is collection

    public Game(int finish)
    {
        win = finish;
        turn = 1; //play1 start
        play1 = 0;
        play2 = 0;
        dice1 = new Dice(); //create obj
        dice2 = new Dice(); //create obj
        tunnels = new ArrayList<Tunnel>();
        
    }
    
    public void addTunnel(int s_in, int s_out)
    {
        Tunnel t = new Tunnel(s_in, s_out); //t is element in collection
        tunnels.add(t);
    }

    public boolean isEnded()
    {
        return play1 >= win || play2 >= win;
    }

    public void play()
    {
        dice1.roll();
        dice2.roll();
        walk(dice1.getValue()+dice2.getValue());

    }
    
    private void walk(int num)
    {
        switch(turn)
        {
            case 1 :
                System.out.print("p1 roll "+num+ " walk from " + play1);
                play1 = play1+num;
                for(Tunnel t : tunnels) //foreach
                {
                    play1 = t.walkIn(play1);
                }
                System.out.println(" to " + play1);
                turn =2;
                break;
            case 2:
                System.out.print("p2 roll "+num+ " walk from " + play2);
                play2 = play2+num;
                for(Tunnel t : tunnels)// foreach
                {
                    play2 = t.walkIn(play2);
                }
                System.out.println(" to " + play2);
                turn = 1;
                break;
        }
        if( play1 >= win )
        {
            System.out.println("PLAYER1 IS WINNER!!!!!");
        }
        else if(play2 >= win)
        { 
            System.out.println("PLAYER2 IS WINNER!!!!!");
        }

    }
    

}