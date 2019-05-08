import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControlPanel extends JPanel {
	public ControlPanel(){
		setLayout(new FlowLayout());
		//add(new JButton("Exit"));
		JButton exButton = new JButton("Exit");
		add(exButton);
		exButton.addActionListener(new ExitAction());
	}
	class ExitAction implements ActionListener{
		public void actionPerformed(ActionEvent e){
			
			System.out.println("Exit this game now");
			System.exit(0);
		}
	}
	
}

