import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class WindowExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Hello Java Program");
		frame.setLocation(500, 400);//��ġ����
		frame.setPreferredSize(new Dimension(300,200));//ũ������
		Container contentPane = frame.getContentPane();
		JLabel label = new JLabel("Hello, Java",SwingConstants.CENTER);
		contentPane.add(label);//�� ��ġ
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//���α׷� ����(������ �۾�)
		frame.pack();
		frame.setVisible(true);//ȭ�� �����ִ��۾�

	}

}
