/*CREATE OR REPLACE PROCEDURE CALL_UPDATE(
P_HAKBUN MEMBER.HAKBUN%TYPE,P_ADDR MEMBER.ADDR%TYPE,
P_PHONE MEMBER.PHONE%TYPE)  
IS 
BEGIN
 UPDATE MEMBER SET ADDR = P_ADDR, PHONE = P_PHONE
 WHERE HAKBUN = P_HAKBUN;
END;
/
 * 
 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class UpdateExam_CALL {

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.52:1522:orcl";
		Connection con = null;
		CallableStatement cstmt = null;
		String hakbun, addr, phone;

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Member 테이블에 값 수정하기.....");
			System.out.println("수정학 학번 입력 : ");
			hakbun = br.readLine();
			System.out.println("새 주소 입력 : ");
			addr = br.readLine();
			System.out.println("새 전화번호 입력 : ");
			phone = br.readLine();

			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "123456");
			cstmt = con.prepareCall("{call call_update(?,?,?)}");
			cstmt.setString(1, hakbun);
			cstmt.setString(2, addr);
			cstmt.setString(3, phone);
			
			cstmt.executeUpdate();
			
			System.out.println("데이터 추가 성공!");
		} catch (Exception e) {
			System.out.println("데이터 연결 실패! = " + e.getMessage());
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