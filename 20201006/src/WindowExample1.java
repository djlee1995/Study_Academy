import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class WindowExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Hello Java Program");
		frame.setLocation(500, 400);//위치조정
		frame.setPreferredSize(new Dimension(300,200));//크기조정
		Container contentPane = frame.getContentPane();
		JLabel label = new JLabel("Hello, Java",SwingConstants.CENTER);
		contentPane.add(label);//라벨 배치
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//프로그램 종료(마지막 작업)
		frame.pack();
		frame.setVisible(true);//화면 보여주는작업

	}

}
