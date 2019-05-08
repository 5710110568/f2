import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
	public GamePanel(){
		System.out.println("My name is Kalvin");
	}

	public void paint(Graphics g) {
		Graphics2D g2d = (Graphics2D) g;

		g2d.setColor(new Color(100,100,100));
		g2d.fillRect(330, 90, 50, 70);//l-ear
		g2d.fillRect(420, 90, 50, 70);//r-ear
		g2d.setColor(new Color(160, 102, 0));
		g2d.fillOval(350, 90, 100, 130);//face--xywh
		g2d.fillRoundRect(340, 220, 125, 200, 50, 50);//body--xywhxaya
		g2d.setColor(new Color(0, 0, 0));
		g2d.fillOval(370, 135, 15, 20);//l-eye
		g2d.fillOval(415, 135, 15, 20);//r-eye
		g2d.fillOval(387, 180, 30, 20);//nose
		g2d.setColor(new Color(255, 200, 200));
		g2d.fillOval(355, 240, 95, 170);//stomach
		g2d.setColor(new Color(100,100,100));
		g2d.fillRoundRect(325, 240, 30, 50, 20, 20);//fl-leg
		g2d.fillRoundRect(450, 240, 30, 50, 20, 20);//fr-leg
		g2d.fillRoundRect(325, 350, 30, 55, 20, 20);//bl-leg
		g2d.fillRoundRect(450, 350, 30, 55, 20, 20);//br-leg
		g2d.setColor(new Color(204,204,204));
		g2d.fillRoundRect(325, 240, 30, 20, 20, 20);//fl-leg
		g2d.fillRoundRect(450, 240, 30, 20, 20, 20);//fr-leg
		g2d.fillRoundRect(325, 405, 30, 20, 20, 20);//bl-leg
		g2d.fillRoundRect(450, 405, 30, 20, 20, 20);//br-leg
		

	}
}