import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class AddRemoveAction implements ActionListener {
	JTable table;
	JTextField text1, text2, text3;

	AddRemoveAction(JTable table,JTextField text1,JTextField text2,JTextField text3) {
		this.table=table;
		this.text1=text1;
		this.text2=text2;
		this.text3=text3;
	}
	AddRemoveAction(JTable table) {
		this.table=table;
			}

	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("Ãß°¡")) {
			String arr[] = new String[3];
			arr[0] = text1.getText();
			arr[1] = text2.getText();
			arr[2] = text3.getText();
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.addRow(arr);
		} else  {
			int row = table.getSelectedRow();

			if (row == -1)
				return;
			DefaultTableModel model = (DefaultTableModel) table.getModel();
			model.removeRow(row);
		}
	}
}
