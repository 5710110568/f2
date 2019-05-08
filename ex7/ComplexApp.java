
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ComplexApp {
	private static final String[] FACES = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "*", "0", "#"};
	public static void main(String[] args){
		JFrame frame = new JFrame("My App");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 300);
		
		JPanel facesPanel = new JPanel();
		GridLayout layout = new GridLayout(0, 3);
		layout.setHgap(5);
		layout.setVgap(2);

		facesPanel.setLayout(layout);
		
		JTextField textField = new JTextField();
		JButton faceButton ;
		for(String face : FACES){
			faceButton = new JButton(face);
			facesPanel.add(faceButton);
			faceButton.addActionListener(new FaceAction(face,textField));
			
		}

		frame.getContentPane().setLayout(new BorderLayout());
		
		textField.setFont(textField.getFont().deriveFont(24.0f));
		frame.add(textField, BorderLayout.PAGE_START);
		
		frame.add(facesPanel, BorderLayout.CENTER);
		
		JButton button = new JButton("Done");
		button.addActionListener(new DoneAction(textField));
		button.setPreferredSize(new Dimension(100, 50));
		frame.add(button, BorderLayout.PAGE_END);
		
		frame.setVisible(true);
	}
	
}

class FaceAction implements ActionListener{
	private String fc;
	JTextField tx;
	public FaceAction(String face, JTextField textField){
		fc = face;
		tx = textField;
	}
	public void actionPerformed(ActionEvent e){
		tx.setText(tx.getText()+fc);

	}
}

class DoneAction implements ActionListener{
	JTextField tx;
	public DoneAction(JTextField textField){
		tx = textField;
	}
	public void actionPerformed(ActionEvent e){
		tx.setText("");
	}
}