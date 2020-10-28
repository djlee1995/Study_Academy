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

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Sungjuk_Exam {
	static String driver = "oracle.jdbc.driver.OracleDriver";
	static String url = "jdbc:oracle:thin:@192.168.0.52:1522:orcl";
	static Connection con = null;
	static PreparedStatement pstmt = null;
	static ResultSet rs = null;

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

	static void input_sungjuk() throws Exception {

		String sql = "Insert Into sungjuk (hakbun,irum,kor,eng,math,tot,avg,grade)" + "Values(?,?,?,?,?,?,?,?)";
		String hakbun, irum, grade;
		int kor, eng, math, tot; 
		double avg;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("학번을 입력 하세요 => ");
		hakbun = br.readLine();
		System.out.print("이름을 입력 하세요 => ");
		irum = br.readLine();
		System.out.print("국어점수를 입력 하세요 => ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어점수를 입력 하세요 => ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학점수를 입력 하세요 => ");
		math = Integer.parseInt(br.readLine());

		tot = kor + eng + math;
		avg = tot / 3.;

		switch ((int) (avg / 10)) {
		case 10:
		case 9:
			grade = "  수";
			break;
		case 8:
			grade = "  우";
			break;
		case 7:
			grade = "  미";
			break;
		case 6:
			grade = "  양";
			break;
		default:
			grade = "  가";
		}

		System.out.println(sql);
		Class.forName(driver);
		con = DriverManager.getConnection(url, "scott", "123456");
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, hakbun);
		pstmt.setString(2, irum);
		pstmt.setInt(3, kor);
		pstmt.setInt(4, eng);
		pstmt.setInt(5, math);
		pstmt.setInt(6, tot);
		pstmt.setDouble(7, avg);
		pstmt.setString(8, grade);

		pstmt.executeUpdate();
		System.out.println("학번입력 성공!");

	}

	static void output_sungjuk() throws Exception {
		Class.forName(driver);
		con = DriverManager.getConnection(url, "scott", "123456");

		String sql = "Select * from sungjuk order by hakbun";
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		System.out.println();
		System.out.println("===============================================================");
		System.out.println("\n학번\t이름 \t국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("===============================================================");
		while (rs.next()) {
			System.out.print(rs.getString("hakbun") + "\t");
			System.out.print(rs.getString("irum") + "\t");
			System.out.print(rs.getString("kor") + "\t");
			System.out.print(rs.getString("eng") + "\t");
			System.out.print(rs.getString("math") + "\t");
			System.out.print(rs.getString("tot") + "\t");
			System.out.print(rs.getString("avg") + "\t");
			System.out.print(rs.getString("grade") + "\n");
		}

		System.out.println("================================================================\n");

	}

	static void search_sungjuk() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String hakbun;
		System.out.print("조회할 학번 입력 => ");
		hakbun = br.readLine();

		String sql = "Select * from sungjuk where hakbun=?";
		Class.forName(driver);
		con = DriverManager.getConnection(url, "scott", "123456");
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, hakbun);
		rs = pstmt.executeQuery();

		System.out.println("\n학번\t이름 \t국어\t영어\t수학\t총점\t평균\t등급");
		System.out.println("===============================================================");
		while (rs.next()) {
			System.out.print(rs.getString("hakbun") + "\t");
			System.out.print(rs.getString("irum") + "\t");
			System.out.print(rs.getString("kor") + "\t");
			System.out.print(rs.getString("eng") + "\t");
			System.out.print(rs.getString("math") + "\t");
			System.out.print(rs.getString("tot") + "\t");
			System.out.print(rs.getString("avg") + "\t");
			System.out.print(rs.getString("grade") + "\n");
		}
		System.out.println("===============================================================");

		System.out.println("\n조회할 학번 입력 오류!!\n");
	}

	static void update_sungjuk() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String hakbun,grade;
		int kor,eng,math,tot;
		double avg;
		System.out.print("수정할 학번 입력 => ");
		hakbun = br.readLine();

		System.out.print("국어 입력 => ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("영어 입력 => ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("수학 입력 => ");
		math = Integer.parseInt(br.readLine());
		
		String sql = "Update sungjuk Set kor = ?,eng = ?,math= ?, tot=?, avg=?, grade=? Where hakbun =?";
		tot = kor + eng + math;
		avg = tot / 3.;

		switch ((int) (avg / 10)) {
		case 10:
		case 9:
			grade = "  수";
			break;
		case 8:
			grade = "  우";
			break;
		case 7:
			grade = "  미";
			break;
		case 6:
			grade = "  양";
			break;
		default:
			grade = "  가";
		}

		System.out.println(sql);
		Class.forName(driver);
		con = DriverManager.getConnection(url, "scott", "123456");
		pstmt = con.prepareStatement(sql);
		pstmt.setInt(1, kor);
		pstmt.setInt(2, eng);
		pstmt.setInt(3, math);
		pstmt.setInt(4, tot);
		pstmt.setDouble(5, avg);
		pstmt.setString(6, grade);
		pstmt.setString(7, hakbun);
		
		pstmt.executeUpdate();
		System.out.println("\n성적정보 수정 성공!!\n");

	}

	static void delete_sungjuk() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String hakbun;
		System.out.print("삭제할 학번 입력 => ");
		hakbun = br.readLine();
		Class.forName(driver);
		con = DriverManager.getConnection(url, "scott", "123456");
		String sql = "Delete from sungjuk Where hakbun = ?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, hakbun);
		pstmt.executeUpdate();

		System.out.println("\n성적정보 삭제 성공!!\n");
		return;

	}
}