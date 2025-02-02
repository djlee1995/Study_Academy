import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class SelectExam2 { //PreparedStatement 를 사용한 데이터 조회

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.52:1522:orcl";
		Connection con = null;
		PreparedStatement stmt = null;
		ResultSet rs = null;
		
		String sql = "Select * from member order by hakbun";

		
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url,"scott","123456");
			stmt = con.prepareStatement(sql);
			rs = stmt.executeQuery();
			
			System.out.println("hakbun\tname\taddr\tphone");
			System.out.println("---------------------------------");
			while(rs.next()) {
				System.out.print(rs.getString("hakbun")+"\t");
				System.out.print(rs.getString("name")+"\t");
				System.out.print(rs.getString("addr")+"\t");
				System.out.print(rs.getString("phone")+"\n");
			}
		} catch (Exception e) {
			System.out.println("데이터베이스 연결 실패!!");
			e.printStackTrace();
		}
		finally {
			try {
				if(con != null) con.close();
				if(stmt != null) stmt.close();
				if(rs != null) rs.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		

	}

}
