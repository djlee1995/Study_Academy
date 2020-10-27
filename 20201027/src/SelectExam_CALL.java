/*DB오라클
 * CREATE OR REPLACE PROCEDURE CALL_SELECT (
             V_MEMBER_CURSOR OUT SYS_REFCURSOR
             )
IS 
BEGIN
          OPEN V_MEMBER_CURSOR
          FOR
          SELECT *
          FROM MEMBER
          ORDER BY HAKBUN;
END;
/

 */


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import oracle.jdbc.OracleTypes;

public class SelectExam_CALL {  //CallableStatement는 저장시저나 저장프로세스를 사용할때 사용
	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.52:1522:orcl";
		Connection con = null;
		CallableStatement cstmt = null;
		ResultSet rs = null;

		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "123456");
			cstmt = con.prepareCall("{call call_select(?)}");
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);
			cstmt.executeQuery();
			
			rs=(ResultSet)cstmt.getObject(1);
			
			System.out.println("hakbun\tname\taddr\tphone");
			System.out.println("---------------------------------");
			while (rs.next()) {
				System.out.print(rs.getString("hakbun") + "\t");
				System.out.print(rs.getString("name") + "\t");
				System.out.print(rs.getString("addr") + "\t");
				System.out.print(rs.getString("phone") + "\n");
			}
		} catch (Exception e) {
			System.out.println("데이터베이스 연결 실패!!");
			e.printStackTrace();
		} finally {
			try {
				if (con != null)
					con.close();
				if (cstmt != null)
					cstmt.close();
				if (rs != null)
					rs.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

}