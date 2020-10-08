import java.awt.*;
import javax.swing.*;

class ImageExample1 {
	public static void main(String[] args) {
		JFrame frame = new JFrame("�̹��� �ε� ���α׷�");
		frame.setLocation(500, 200);
		frame.setPreferredSize(new Dimension(500, 400));
		Container contentPane = frame.getContentPane();
		ImagePanel imagePanel = new ImagePanel();
		contentPane.add(imagePanel, BorderLayout.CENTER);
		JPanel controlPanel = new JPanel();
		JTextField text = new JTextField(30);
		JButton button = new JButton("�̹��� �ε�");
		controlPanel.add(text);
		controlPanel.add(button);
		contentPane.add(controlPanel, BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		button.addActionListener(new LoadActionListener(text, imagePanel));
		frame.pack();
		frame.setVisible(true);
	}
}
