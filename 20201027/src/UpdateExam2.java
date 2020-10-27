import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class UpdateExam2 { //PreparedStatement 를 사용한 데이터 수정

	public static void main(String[] args) {
		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@192.168.0.52:1522:orcl";
		Connection con = null;
		PreparedStatement pstmt = null;
		
		String hakbun,addr,phone;

		try {
			
			BufferedReader br = new BufferedReader(
					new InputStreamReader(System.in));
			System.out.print("갱신할 학번 입력: ");
			hakbun = br.readLine();
			System.out.print("새 주소 입력: ");
			addr = br.readLine();
			System.out.print("새 전화번호 입력: ");
			phone = br.readLine();
			String sql = "Update member Set addr = ?,phone =? Where hakbun =?";

			Class.forName(driver);
			con = DriverManager.getConnection(url,"scott","123456");

			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,addr);
			pstmt.setString(2,phone);
			pstmt.setString(3,hakbun);
			
			pstmt.executeUpdate();
			 System.out.println("데이터베이스 내용 갱신 성공");
			
		} catch (Exception e) {
			System.out.println("데이터 연결 실패! = "+e.getMessage());
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

