import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class DrawActionListner implements ActionListener {
	JTextField txtKor, txtEng, txtMath;
	DrawingPanel drawingPanel;

	DrawActionListner(JTextField txtKor, JTextField txtEng, JTextField txtMath, DrawingPanel drawingPanel) {
		this.txtKor = txtKor;
		this.txtEng = txtEng;
		this.txtMath = txtMath;
		this.drawingPanel = drawingPanel;
	}

	public void actionPerformed(ActionEvent e) {
		try {
			int korean = Integer.parseInt(txtKor.getText());
			int english = Integer.parseInt(txtEng.getText());
			int math = Integer.parseInt(txtMath.getText());
			drawingPanel.setScores(korean, english, math);
			drawingPanel.repaint(); //print �޼��� ȣ��

		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(drawingPanel, "�߸��� ���� �����Դϴ�.", "�����޽���", JOptionPane.ERROR_MESSAGE);
		}
	}
}
