class Game {
    private int p1;
    private int p2;
    private int maxSlot;
    private int turn;
    private Dice dice;

    public Game(int max_slot) {
        maxSlot = max_slot;
        p1 = 0;
        p2 = 0;
        turn = 1;
      dice = new Dice();
    }

    public void walk(int slot) {
        if (turn == 1) {
            p1 = p1 + slot;
            turn = 2;
        } else if (turn == 2) {
            p2 = p2 + slot;
            turn = 1;
        }
        if (p1 >= maxSlot) {
            System.out.println("Player 1 win!");
        } else if (p2 >= maxSlot) {
            System.out.println("Player 2 win!");
        }

    }

    public boolean isEnded() {
        return p1 >= maxSlot;
    }

    public void play() {
        dice.roll();
        walk(dice.getValue());
    }
}

public class Snake {
    public static void main(String[] args) {
        Game g = new Game(30);
        while (!g.isEnded()) {
            g.play();
        }
    }
}