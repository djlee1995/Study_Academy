/*CREATE TABLE SUNGJUK(
HAKBUN VARCHAR2(4) PRIMARY KEY,
IRUM VARCHAR2(15),
KOR NUMBER(3),
ENG NUMBER(3),
MATH NUMBER(3),
TOT NUMBER(3),
AVG NUMBER(3),
GRADE VARCHAR2(4));
*/
package Teacher;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Sungjuk_Ex {
	public static void main(String[] args) throws Exception {
		int menu;
		Scanner scan = new Scanner(System.in);

		while (true) {
			printMenu();
			System.out.print("메뉴 선택 => ");
			menu = scan.nextInt();
			System.out.println();

			if (menu == 6) {
				System.out.println("The End...");
				break;
			}

			switch (menu) {
			case 1:
				input_sungjuk();
				break;
			case 2:
				output_sungjuk();
				break;
			case 3:
				search_sungjuk();
				break;
			case 4:
				update_sungjuk();
				break;
			case 5:
				delete_sungjuk();
				break;
			default:
				System.out.println("메뉴를 다시 선택하세요!!!\n");
			}
		}
	}

	static void printMenu() {
		System.out.println("*** 성적관리 ***");
		System.out.println("1. 성적정보 입력");
		System.out.println("2. 성적정보 출력");
		System.out.println("3. 성적정보 조회");
		System.out.println("4. 성적정보 수정");
		System.out.println("5. 성적정보 삭제");
		System.out.println("6. 프로그램 종료");
		System.out.println();
	}

	static Connection connectDB() {
		Connection con = null;
		try {
			String driver = "oracle.jdbc.driver.OracleDriver";
			String url = "jdbc:oracle:thin:@192.168.0.52:1522:orcl";

			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "123456");

		} catch (Exception e) {
			System.out.println("데이터베이스 연결 실패!");
			e.printStackTrace();
		}
		return con;
	}

	static void input_sungjuk() {
		Sungjuk obj = new Sungjuk();
		String sql = "Insert Into sungjuk (hakbun,irum,kor,eng,math,tot,avg,grade)" + " Values(?,?,?,?,?,?,?,?)";
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			obj.input_sungjuk();
			obj.process_sungjuk();
			con = connectDB();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, obj.hakbun);
			pstmt.setString(2, obj.irum);
			pstmt.setInt(3, obj.kor);
			pstmt.setInt(4, obj.eng);
			pstmt.setInt(5, obj.math);
			pstmt.setInt(6, obj.tot);
			pstmt.setDouble(7, obj.avg);
			pstmt.setString(8, obj.grade);
			int res = pstmt.executeUpdate();
			if (res == 1)
				System.out.println("\n 성적입력성공!!!");
			else
				System.out.println("\n 이미 입력된 학번입니다!!!");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("\n 데이터베이스 연결 실패! +" + e.getMessage());
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

	static void output_sungjuk() {
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		ResultSet rs1 = null;
		ResultSet rs2 = null;
		String sql1 = "select count(*) from sungjuk";
		String sql2 = "select * from sungjuk order by hakbun";
		Connection con = null;

		try {
			Sungjuk obj = new Sungjuk();
			con = connectDB();

			pstmt1 = con.prepareStatement(sql1);
			rs1 = pstmt1.executeQuery();
			rs1.next();
			if (rs1.getInt(1) == 0)
				System.out.println("\n출력할 데이터가 없습니다.\n");
			else {
				pstmt2 = con.prepareStatement(sql2);
				rs2 = pstmt2.executeQuery();

				System.out.println();
				System.out.println("\n학번\t이름 \t국어\t영어\t수학\t총점\t평균\t등급");
				System.out.println("===============================================================");
				while (rs2.next()) {
					System.out.print(rs2.getString("hakbun") + "\t");
					System.out.print(rs2.getString("irum") + "\t");
					System.out.print(rs2.getString("kor") + "\t");
					System.out.print(rs2.getString("eng") + "\t");
					System.out.print(rs2.getString("math") + "\t");
					System.out.print(rs2.getString("tot") + "\t");
					System.out.print(rs2.getString("avg") + "\t");
					System.out.print(rs2.getString("grade") + "\n");
				}

				System.out.println("================================================================\n");
			}
		} catch (Exception e) {
			System.out.println("\n 데이터베이스 연결 실패! +" + e.getMessage());
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt1 != null)
					pstmt1.close();
				if (pstmt2 != null)
					pstmt2.close();
				if (rs1 != null)
					rs1.close();
				if (rs2 != null)
					rs2.close();

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}

	static void search_sungjuk() {
		Sungjuk obj = new Sungjuk();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from sungjuk where hakbun = ?";
		Connection con = null;
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("\n조회할 학번 입력 =>");
			String hakbun = scan.next();

			con = connectDB();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, hakbun);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				System.out.println();
				System.out.println("===============================================================");
				System.out.println("\n학번\t이름 \t국어\t영어\t수학\t총점\t평균\t등급");
				System.out.println("===============================================================");
				System.out.print(rs.getString("hakbun") + "\t");
				System.out.print(rs.getString("irum") + "\t");
				System.out.print(rs.getInt("kor") + "\t");
				System.out.print(rs.getInt("eng") + "\t");
				System.out.print(rs.getInt("math") + "\t");
				System.out.print(rs.getInt("tot") + "\t");
				System.out.print(rs.getDouble("avg") + "\t");
				System.out.println(rs.getString("grade") + "\t");
			} else {
				System.out.println("\n 출력할 데이터가 없습니다!!\n");
			}

		} catch (Exception e) {
			System.out.println("\n 데이터베이스 연결 실패! +" + e.getMessage());
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
				if (rs != null)
					rs.close();

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	static void update_sungjuk() {
		Sungjuk obj = new Sungjuk();
		String sql = "Update sungjuk Set kor = ?,eng = ?,math= ?, tot=?, avg=?, grade=? Where hakbun =?";
		PreparedStatement pstmt = null;
		Connection con = null;
		try {
			Scanner scan = new Scanner(System.in);

			System.out.print("\n변경할 학번 입력 =>");
			obj.hakbun = scan.next();
			System.out.print("국어입력=> ");
			obj.kor = scan.nextInt();
			System.out.print("영어입력=> ");
			obj.eng = scan.nextInt();
			System.out.print("수학입력=> ");
			obj.math = scan.nextInt();
			obj.process_sungjuk();
			con = connectDB();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, obj.kor);
			pstmt.setInt(2, obj.eng);
			pstmt.setInt(3, obj.math);
			pstmt.setInt(4, obj.tot);
			pstmt.setDouble(5, obj.avg);
			pstmt.setString(6, obj.grade);
			pstmt.setString(7, obj.hakbun);
			int res = pstmt.executeUpdate();
			if (res == 1) {
				System.out.println("\n" + obj.hakbun + "학번수정완료!!");
			} else {
				System.out.println("\n 존재하지않는 학번입니다.!!" + res);
			}
		} catch (Exception e) {
			System.out.println("\n 데이터베이스 연결 실패! +" + e.getMessage());
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

	static void delete_sungjuk() {
		PreparedStatement pstmt = null;
		Connection con = null;
		Sungjuk obj = new Sungjuk();
		String sql = "Delete from sungjuk Where hakbun = ?";
		try {
			Scanner scan = new Scanner(System.in);

			System.out.print("삭제할 학번 입력 => ");
			String hakbun = scan.next();
			con = connectDB();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, hakbun);
			int res = pstmt.executeUpdate();
			if (res == 1) {
				System.out.println("\n성적정보 삭제 성공!!\n");

			} else {
				System.out.println("\n삭제할 학번이 없습니다.!!\n");

			}
		} catch (Exception e) {
			System.out.println("\n 데이터베이스 연결 실패! +" + e.getMessage());
		} finally {
			try {
				if (con != null)
					con.close();
				if (pstmt != null)
					pstmt.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}

	}
}
