import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.JTextField;

public class ConfirmButtonActionListener implements ActionListener{
	JTextField text;
	JLabel label;
	public ConfirmButtonActionListener(JTextField text, JLabel label) {
		// TODO Auto-generated constructor stub
		this.text = text;
		this.label = label;
	}
	public void actionPerformed(ActionEvent e) {
		String name = text.getText();
		label.setText("Hello, " + name);
		
	}
}
