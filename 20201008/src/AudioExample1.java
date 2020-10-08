import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class AudioExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("오디오 플레이 프로그램");
		frame.setLocation(500, 200);
		frame.setPreferredSize(new Dimension(500, 400));
		Container contentPane = frame.getContentPane();
		contentPane.setLayout(new FlowLayout());
		JTextField text = new JTextField(30);
		JButton button = new JButton("플레이");
		contentPane.add(text);
		contentPane.add(button);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.addActionListener(new PlayActionListner(text));
		frame.pack();
		frame.setVisible(true);

	}

}
