import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateExam2 { //PreparedStatement �� ����� ������ ����

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.52:1522:orcl";
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String hakbun,addr,phone;

		try {
			
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			System.out.print("������ �й� �Է�: ");
			hakbun = br.readLine();
			System.out.print("�� �ּ� �Է�: ");
			addr = br.readLine();
			System.out.print("�� ��ȭ��ȣ �Է�: ");
			phone = br.readLine();
			String sql = "Update member Set addr = ?,phone =? Where hakbun =?";

			Class.forName(driver);
			con = DriverManager.getConnection(url,"scott","123456");

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,addr);
			pstmt.setString(2,phone);
			pstmt.setString(3,hakbun);
			
			pstmt.executeUpdate();
			 System.out.println("�����ͺ��̽� ���� ���� ����");
			
		} catch (Exception e) {
			System.out.println("������ ���� ����! = "+e.getMessage());
		}
		finally {
			try {
				if(con != null) con.close();
				if(pstmt != null) pstmt.close();
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		}

}

