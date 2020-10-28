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
			System.out.print("�޴� ���� => ");
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
				System.out.println("�޴��� �ٽ� �����ϼ���!!!\n");
			}
		}
	}

	static void printMenu() {
		System.out.println("*** �������� ***");
		System.out.println("1. �������� �Է�");
		System.out.println("2. �������� ���");
		System.out.println("3. �������� ��ȸ");
		System.out.println("4. �������� ����");
		System.out.println("5. �������� ����");
		System.out.println("6. ���α׷� ����");
		System.out.println();
	}

	static void input_sungjuk() throws Exception {

		String sql = "Insert Into sungjuk (hakbun,irum,kor,eng,math,tot,avg,grade)" + "Values(?,?,?,?,?,?,?,?)";
		String hakbun, irum, grade;
		int kor, eng, math, tot; 
		double avg;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("�й��� �Է� �ϼ��� => ");
		hakbun = br.readLine();
		System.out.print("�̸��� �Է� �ϼ��� => ");
		irum = br.readLine();
		System.out.print("���������� �Է� �ϼ��� => ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("���������� �Է� �ϼ��� => ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("���������� �Է� �ϼ��� => ");
		math = Integer.parseInt(br.readLine());

		tot = kor + eng + math;
		avg = tot / 3.;

		switch ((int) (avg / 10)) {
		case 10:
		case 9:
			grade = "  ��";
			break;
		case 8:
			grade = "  ��";
			break;
		case 7:
			grade = "  ��";
			break;
		case 6:
			grade = "  ��";
			break;
		default:
			grade = "  ��";
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
		System.out.println("�й��Է� ����!");

	}

	static void output_sungjuk() throws Exception {
		Class.forName(driver);
		con = DriverManager.getConnection(url, "scott", "123456");

		String sql = "Select * from sungjuk order by hakbun";
		pstmt = con.prepareStatement(sql);
		rs = pstmt.executeQuery();
		
		System.out.println();
		System.out.println("===============================================================");
		System.out.println("\n�й�\t�̸� \t����\t����\t����\t����\t���\t���");
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
		System.out.print("��ȸ�� �й� �Է� => ");
		hakbun = br.readLine();

		String sql = "Select * from sungjuk where hakbun=?";
		Class.forName(driver);
		con = DriverManager.getConnection(url, "scott", "123456");
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, hakbun);
		rs = pstmt.executeQuery();

		System.out.println("\n�й�\t�̸� \t����\t����\t����\t����\t���\t���");
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

		System.out.println("\n��ȸ�� �й� �Է� ����!!\n");
	}

	static void update_sungjuk() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String hakbun,grade;
		int kor,eng,math,tot;
		double avg;
		System.out.print("������ �й� �Է� => ");
		hakbun = br.readLine();

		System.out.print("���� �Է� => ");
		kor = Integer.parseInt(br.readLine());
		System.out.print("���� �Է� => ");
		eng = Integer.parseInt(br.readLine());
		System.out.print("���� �Է� => ");
		math = Integer.parseInt(br.readLine());
		
		String sql = "Update sungjuk Set kor = ?,eng = ?,math= ?, tot=?, avg=?, grade=? Where hakbun =?";
		tot = kor + eng + math;
		avg = tot / 3.;

		switch ((int) (avg / 10)) {
		case 10:
		case 9:
			grade = "  ��";
			break;
		case 8:
			grade = "  ��";
			break;
		case 7:
			grade = "  ��";
			break;
		case 6:
			grade = "  ��";
			break;
		default:
			grade = "  ��";
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
		System.out.println("\n�������� ���� ����!!\n");

	}

	static void delete_sungjuk() throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String hakbun;
		System.out.print("������ �й� �Է� => ");
		hakbun = br.readLine();
		Class.forName(driver);
		con = DriverManager.getConnection(url, "scott", "123456");
		String sql = "Delete from sungjuk Where hakbun = ?";
		pstmt = con.prepareStatement(sql);
		pstmt.setString(1, hakbun);
		pstmt.executeUpdate();

		System.out.println("\n�������� ���� ����!!\n");
		return;

	}
}