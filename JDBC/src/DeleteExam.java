import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteExam {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.52:1522:orcl";
		Connection con = null;
		Statement stmt = null;

		String hakbun = null;

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.print("���� �� �й� �Է�: ");
			hakbun = br.readLine();
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "123456");
			stmt = con.createStatement();
			String sql = "Delete from member Where hakbun ='" + hakbun + "'";
			stmt.executeQuery(sql);

			System.err.println("�����ͺ��̽� ���� ���� ����!");

		} catch (Exception e) {
			System.out.println("�����ͺ��̽� ���� ����!!" + e.getMessage());

		} finally {
			try {
				if (con != null)
					con.close();
				if (stmt != null)
					stmt.close();

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}
