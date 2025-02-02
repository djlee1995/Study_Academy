import javax.swing.*;
import java.awt.event.*;

class LoadActionListener implements ActionListener {
	JTextField text;
	ImagePanel imagePanel;

	LoadActionListener(JTextField text, ImagePanel imagePanel) {
		this.text = text;
		this.imagePanel = imagePanel;
	}

	public void actionPerformed(ActionEvent e) {
		imagePanel.setPath(text.getText());
		imagePanel.repaint();
	}
}
