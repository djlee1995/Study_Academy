import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateExam {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.52:1522:orcl";
		Connection con = null;
		Statement stmt = null;
		
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
			
			String sql = "Update member Set addr = '"+addr;
			sql += "',phone = '" + phone + "'Where hakbun ='";
			sql += hakbun +"'";
			System.err.println(sql);
			Class.forName(driver);
			con = DriverManager.getConnection(url,"scott","123456");
			stmt = con.createStatement();
			 stmt.executeUpdate(sql);
			 System.out.println("�����ͺ��̽� ���� ���� ����");
			
		} catch (Exception e) {
			System.out.println("������ ���� ����! = "+e.getMessage());
		}
		finally {
			try {
				if(con != null) con.close();
				if(stmt != null) stmt.close();
				
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
		}

}

