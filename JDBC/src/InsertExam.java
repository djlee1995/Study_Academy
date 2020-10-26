
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertExam {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.52:1522:orcl";
		Connection con = null;
		Statement stmt = null;
		
		String sql = "Insert Into member (hakbun,name,addr,phone)" + "Values";
		String hakbun,name,addr,phone;
		BufferedReader br = null;
		try {
			br = new BufferedReader(
					new InputStreamReader(System.in));
			System.out.println("Member ���̺� �� �߰��ϱ�.....");
			System.out.println("�й� �Է� : ");
			hakbun = br.readLine();
			System.out.println("�̸� �Է� : ");
			name = br.readLine();
			System.out.println("�ּ� �Է� : ");
			addr = br.readLine();
			System.out.println("��ȭ��ȣ �Է� : ");
			phone = br.readLine();
			
			sql+="('"+hakbun+"','"+name+"','"+addr+"','"+phone+"')";
			System.out.println(sql);
			Class.forName(driver);
			con = DriverManager.getConnection(url,"scott","123456");
			stmt = con.createStatement();
			int res = stmt.executeUpdate(sql);
			if(res==1)
				System.out.println("������ �߰� ����!");
		} catch (Exception e) {
			System.out.println("������ ���� ����! = "+e.getMessage());
		}
		finally {
			try {
				if(con != null) con.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			try {
				if(stmt != null) stmt.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			try {
				if(br != null) br.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
