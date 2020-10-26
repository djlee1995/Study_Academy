
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class TestJdbc {

	public static void main(String[] args) throws Exception {
		// driver 肺爹
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Connection 按眉 积己
		Connection con = DriverManager.getConnection(
		"jdbc:oracle:thin:@192.168.0.52:1522:orcl","scott","123456");
		
		//Statement 按眉积己
		Statement stmt = con.createStatement();
		//sql
		String sql="select ename,deptno from emp";
		//sql 角青 饶 ResultSet 按眉 馆券
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
