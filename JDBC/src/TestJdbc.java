
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestJdbc {

	public static void main(String[] args) throws Exception {
		// driver �ε�
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Connection ��ü ����
		Connection con = DriverManager.getConnection(
		"jdbc:oracle:thin:@192.168.0.52:1522:orcl","scott","123456");
		
		//Statement ��ü����
		Statement stmt = con.createStatement();
		//sql
		String sql="select ename,deptno from emp";
		//sql ���� �� ResultSet ��ü ��ȯ
		ResultSet rset = stmt.executeQuery(sql);
		int deptno=0;
		String name = null;
		while(rset.next()) {
			name=rset.getString("ename");
			deptno=rset.getInt("deptno");
			System.out.println(name+"   "+deptno);
		}
	}

}
