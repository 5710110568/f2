public class PlayGame3
{
    public static void main(String args[])
    {
        Game g = new Game(30);
        g.addTunnel(27,13);
        g.addTunnel(12,18);
        g.addTunnel(7,9);
        g.addTunnel(4,6);
        g.addTunnel(10,8);
        g.addTunnel(25,23);
        g.addTunnel(28,17);
        g.addTunnel(11,16);
        g.addTunnel(24,29);

        while(!g.isEnded()) //check game
        {
            g.play();
        }
    }
}