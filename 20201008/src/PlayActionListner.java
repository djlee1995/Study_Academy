import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PlayActionListner implements ActionListener {
	JTextField text;

	public PlayActionListner(JTextField text) {
		// TODO Auto-generated constructor stub
		this.text = text;
	}

	public void actionPerformed(ActionEvent e) {
		try {
			File file = new File(text.getText());
			AudioClip audioClip = Applet.newAudioClip(file.toURL());
			audioClip.play();
		} catch (Exception e2) {
			JOptionPane.showMessageDialog(text, "�߸��� �����Դϴ�.", "�����޼���", JOptionPane.ERROR_MESSAGE);
		}
	}
}
