/*CREATE OR REPLACE PROCEDURE CALL_INSERT(
HAKBUN MEMBER.HAKBUN%TYPE,NAME MEMBER.NAME%TYPE
,ADDR MEMBER.ADDR%TYPE,PHONE MEMBER.PHONE%TYPE)  
IS 
BEGIN
 INSERT INTO MEMBER VALUES(HAKBUN,NAME,ADDR,PHONE);
END;
/
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class InsertExam_CALL {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.52:1522:orcl";
		Connection con = null;
		CallableStatement cstmt = null;
		ResultSet rs = null;
		String hakbun, name, addr, phone;

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Member ���̺� �� �߰��ϱ�.....");
			System.out.println("�й� �Է� : ");
			hakbun = br.readLine();
			System.out.println("�̸� �Է� : ");
			name = br.readLine();
			System.out.println("�ּ� �Է� : ");
			addr = br.readLine();
			System.out.println("��ȭ��ȣ �Է� : ");
			phone = br.readLine();

			
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "123456");
			cstmt = con.prepareCall("{call call_insert(?,?,?,?)}");
			cstmt.setString(1, hakbun);
			cstmt.setString(2, name);
			cstmt.setString(3, addr);
			cstmt.setString(4, phone);
			cstmt.executeUpdate();
			System.out.println("������ �߰� ����!");
		} catch (Exception e) {
			System.out.println("������ ���� ����! = " + e.getMessage());
		} finally {
			try {
				if (con != null)
					con.close();
				if (cstmt != null)
					cstmt.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}

		}

	}

}