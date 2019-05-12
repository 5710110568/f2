import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public class Player extends Sprite {
  private static Color[] COLORS = {Color.BLUE, Color.MAGENTA };
  private String name;
  private int index;
  private Board board;
  private PlayerListener listener;
  private int currentPos = 0;

  public Player(String name, int index, Board board, PlayerListener listener) {
    this.name = name;
    this.index = index;
    this.board = board;
    this.listener = listener;
  }

  public void walk(int steps) {
    int next_position = Math.min(currentPos + steps, board.getFinishPos());
    System.out.println(this + " walks from " + currentPos + " to " + next_position);
    new WalkerThread(next_position).start();     
  }

  public void doWalking(){
    listener.walking(this);
  }

  public void doWalkCompleted(){
    Integer tunnelOutPos = board.getTunnelOutPos(currentPos);
    int sad;
    
   try{       
   //  dangerouse Zone with tunnel - 3 
    if(tunnelOutPos>50){
      System.out.println(this + " enter tunnel from " + currentPos + " to " + tunnelOutPos.intValue());
      
      currentPos=tunnelOutPos.intValue();
      doWalking();
      
      sad = tunnelOutPos.intValue()-3; // -3 
      try{ Thread.sleep(300); } catch(Exception e){}       
      while(currentPos > sad){
        currentPos --;
        doWalking();
             
        try{ Thread.sleep(300); } catch(Exception e){}        
      }
    }
    try{ Thread.sleep(300); } catch(Exception e){}
    bombs();
    int com;
    switch (currentPos) {
      //continue cases
      case 59:currentPos=43;
      doWalking();conti();break;
      case 73:currentPos=67;
      doWalking();conti();break;
      case 78:currentPos=62;
      doWalking();conti();break;                
      ///////no continue cases
      case 30:currentPos=13;
      doWalking();break;
      case 47:currentPos=35;
      doWalking();break;
      case 41:currentPos=21;
      doWalking();break;
      case 49:currentPos=33;
      doWalking();break;
      default:
        break;
    }
    
   //   normal tunnel  
    if(tunnelOutPos <=50){
      System.out.println(this + " enter tunnel from " + currentPos + " to " + tunnelOutPos.intValue());
      currentPos = tunnelOutPos.intValue();
      
      doWalking();
      try{ Thread.sleep(600); } catch(Exception e){} 
      getGold();// get after
      
    }
           
  }catch(NullPointerException e){} ////////////////////////////////////////////////////////
  
    listener.walkCompleted(this);
    if (currentPos >= board.getFinishPos()) {      
      this.listener.hasWon(this);
    }   
  }

  @Override
  public void draw(Graphics2D g2d){
    if(currentPos > 0){
      g2d.setColor(COLORS[index]);
      Point ref = board.getRefLocationForPos(currentPos);
      g2d.fillOval(ref.x + 10 + (index * 40), ref.y + 30, 20, 20);
    }
  }

  public String getName() {
    return name;
  }

  @Override
  public String toString() {
    return getName();
  }  
 /////////////////////////////////////////////////////////Thread
  private class WalkerThread extends Thread {
    private int toPos;
    public WalkerThread(int toPos){
      this.toPos = toPos;
    } 
    public void run(){
      while(currentPos < toPos){
        
        currentPos ++;
        doWalking();
        
        
        try{ Thread.sleep(300); } catch(Exception e){}        
      }
        
      getGold();
      bombs();
    
      
      doWalkCompleted();
      
    }
  }

  /////////////////////////////////////////////////get gold +8 point
   public void getGold(){
    try{ Thread.sleep(300); } catch(Exception e){}
    int comparegold=0;
    if(currentPos==11){
      comparegold = 19;
      while(currentPos < comparegold){
        currentPos ++;
        doWalking();
             
        try{ Thread.sleep(300); } catch(Exception e){}        
      }
   }
   if(currentPos==18){
    comparegold =26 ;
    while(currentPos < comparegold){
      currentPos ++;
      doWalking();
           
      try{ Thread.sleep(300); } catch(Exception e){}        
    }
 }
 if(currentPos==21){
  comparegold = 29;
  while(currentPos < comparegold){
    currentPos ++;
    doWalking();
         
    try{ Thread.sleep(300); } catch(Exception e){}        
  }
}
if(currentPos==48){
  comparegold = 56;
  while(currentPos < comparegold){
    currentPos ++;
    doWalking();
         
    try{ Thread.sleep(300); } catch(Exception e){}        
  }
}
if(currentPos==71){
  comparegold = 79;
  while(currentPos < comparegold){
    currentPos ++;
    doWalking();
         
    try{ Thread.sleep(300); } catch(Exception e){}        
  }
}

  }
  //////////////////////////////////////////BOMBS - 9 point
 
public void bombs(){
  int comparebomb=0;
  try{ Thread.sleep(300); } catch(Exception e){}
  if(currentPos==51){
    comparebomb = 42;
    while(currentPos > comparebomb){
      currentPos --;
      doWalking();
           
      try{ Thread.sleep(300); } catch(Exception e){}        
    }
  }
  if(currentPos==60){
    comparebomb = 51;
    while(currentPos > comparebomb){
      currentPos --;
      doWalking();
           
      try{ Thread.sleep(300); } catch(Exception e){}        
    }
  }
  if(currentPos==68){
    comparebomb = 61;
    while(currentPos > comparebomb){
      currentPos --;
      doWalking();
           
      try{ Thread.sleep(300); } catch(Exception e){}        
    }
  }
  if(currentPos==77){
    comparebomb = 68;
    while(currentPos > comparebomb){
      currentPos --;
      doWalking();
           
      try{ Thread.sleep(300); } catch(Exception e){}        
    }
  }
  
}
public void conti(){
  try{ Thread.sleep(600); } catch(Exception e){}
 int com1=currentPos-3;
  while(currentPos > com1){
    currentPos --;
    doWalking();
         
    try{ Thread.sleep(300); } catch(Exception e){}        
  }
}

}
