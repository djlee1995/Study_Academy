import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class WindowExample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("참가자 명단 프로그램");
		frame.setPreferredSize(new Dimension(300,150));
		frame.setLocation(500,400);
		Container contentPane = frame.getContentPane();
		String colName[]= {"이름","나이","성별"};
		Object data[][]= {{"김철수",24,"남"},{"이순희",21,"여"},{"박지영",26,"여"}};
		JTable table = new JTable(data,colName);
		JScrollPane scrollPane = new JScrollPane(table);
		contentPane.add(scrollPane,BorderLayout.CENTER);
		JButton button = new JButton("출력");
		button.addActionListener(new PrintActionListener(table));
		contentPane.add(button,BorderLayout.SOUTH);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setVisible(true);
	}

}
