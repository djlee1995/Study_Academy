package GUITest;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

public class EventSangpum implements ActionListener {
	JTable table;
	JTextField txtCode, txtIrum, txtCount, txtPrice;

	EventSangpum() {

	}

	EventSangpum(JTable table) {
		this.table = table;

	}

	EventSangpum(JTable table, JTextField txtCode, JTextField txtIrum, JTextField txtCount, JTextField txtPrice) {
		this.table = table;
		this.txtCode = txtCode;
		this.txtIrum = txtIrum;
		this.txtCount = txtCount;
		this.txtPrice = txtPrice;
		

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getActionCommand().equals("추가")) {

			insert();
		} else if (e.getActionCommand().equals("삭제")) {
			delite();

		}

		else {
			update();
		}
	}

	void insert() {
		Sangpum obj = new Sangpum();
		int i, rowNum, flag = 0;
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		obj.code = txtCode.getText().trim();

		rowNum = model.getRowCount();
		for (i = 0; i < rowNum; i++) {
			String table_hakbun = model.getValueAt(i, 0).toString().trim();
			if (table_hakbun.equals(obj.code)) {
				flag = 1;
				break;
			}
		}
		if (flag == 0) {
			obj.irum = txtIrum.getText().trim();
			obj.count = Integer.parseInt(txtCount.getText().trim());
			obj.price = Integer.parseInt(txtPrice.getText().trim());
			obj.process_sangpum();
			
			Object arr[] = new Object[5];
			arr[0] = obj.code;
			arr[1] = obj.irum;
			arr[2] = obj.count;
			arr[3] = obj.price;
			arr[4] = obj.sum;
		
		
			

			model.addRow(arr);
			JOptionPane.showMessageDialog(null, "상품코드" + obj.code + "추가성공!");

		} else
			JOptionPane.showMessageDialog(null, "상품코드" + obj.code + "중복오류로 추가 실패!");
		txtCode.setText("");
		txtIrum.setText("");
		txtCount.setText("");
		txtPrice.setText("");

	}

	void delite() {
		int row = table.getSelectedRow();
		if (row == -1)
			return;
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		String code = model.getValueAt(row, 0).toString().trim();
		model.removeRow(row);
		JOptionPane.showMessageDialog(null, "상품코드" + code + "삭제성공!");
	}

	void update() {
		int i, rowNum, flag = 0;
		String table_Code = null;
		DefaultTableModel model = (DefaultTableModel) table.getModel();
		Sangpum obj = new Sangpum();

		obj.code = txtCode.getText().trim();
		obj.count = Integer.parseInt(txtCount.getText().trim());
		obj.price = Integer.parseInt(txtPrice.getText().trim());
		obj.process_sangpum();

		rowNum = model.getRowCount();
		for (i = 0; i < rowNum; i++) {
			table_Code = model.getValueAt(i, 0).toString().trim();
			if (table_Code.equals(obj.code)) {
				model.setValueAt(obj.count, i, 2);
				model.setValueAt(obj.price, i, 3);
				model.setValueAt(obj.sum, i, 4);
				flag = 1;
				break;
			}
		}
		if (flag == 0)
			JOptionPane.showMessageDialog(null, "상품코드" + obj.code + "수정실패!");

		else
			JOptionPane.showMessageDialog(null, "상품코드" + obj.code + "수정성공!");

		txtCode.setText("");
		txtIrum.setText("");
		txtCount.setText("");
		txtPrice.setText("");
		
	}

}
