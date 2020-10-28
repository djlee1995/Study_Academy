
/*CREATE TABLE SANGPUM(
CODE VARCHAR2(4) PRIMARY KEY,
IRUM VARCHAR2(15),
COUNT NUMBER(3),
PRICE NUMBER(3),
SUM NUMBER(3),
GRADE VARCHAR2(4)
);*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Sangpum_Exam {

	public static void main(String[] args) throws Exception {
		int menu;
		Scanner scan = new Scanner(System.in);
		while (true) {
			printMenu();
			System.out.print("�޴� ���� => ");
			menu = scan.nextInt();
			System.out.println();

			if (menu == 7) { //���α׷� ����
				System.out.println("The End...");
				break;
			}

			switch (menu) {
			case 1:
				input_sangpum(); //��ǰ���� �Է�
				break;
			case 2:
				output_sangpum(); //��ǰ���� ���
				break;
			case 3:
				search_sangpum(); //��ǰ���� ��ȸ
				break;
			case 4:
				update_sangpum(); //��ǰ���� ����
				break;
			case 5:
				delete_sangpum(); //��ǰ���� ����
				break;
			case 6:
				format_sangpum(); //��ǰ���� ����
				break;
			default:
				System.out.println("�޴��� �ٽ� �����ϼ���!!!\n");
			}

		}
	}

	static void printMenu() {
		System.out.println("*** ��ǰ���� ***");
		System.out.println("1. ��ǰ���� �Է�");
		System.out.println("2. ��ǰ���� ���");
		System.out.println("3. ��ǰ���� ��ȸ");
		System.out.println("4. ��ǰ���� ����");
		System.out.println("5. ��ǰ���� ����");
		System.out.println("6. ��ǰ���� ����");
		System.out.println("7. ���α׷� ����");
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
			System.out.println("�����ͺ��̽� ���� ����!");
			e.printStackTrace();
		}
		return con;
	}

	static void input_sangpum() {
		Sangpum obj = new Sangpum();
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "Insert Into sangpum (code,irum,count,price,sum,grade)" + " Values(?,?,?,?,?,?)";
		try {
			obj.input_sangpum();
			obj.process_sangpum();
			con = connectDB();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, obj.code);
			pstmt.setString(2, obj.irum);
			pstmt.setInt(3, obj.count);
			pstmt.setInt(4, obj.price);
			pstmt.setInt(5, obj.sum);
			pstmt.setString(6, obj.grade);
			int res = pstmt.executeUpdate();
			if (res == 1)
				System.out.println("\n ��ǰ ���� �Է� ����!!!");
			else
				System.out.println("\n �ߺ� ��ǰ �ڵ� �Դϴ�!!!");
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("\n �����ͺ��̽� ���� ����! +" + e.getMessage());
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

	static void output_sangpum() {
		Sangpum obj = new Sangpum();
		Connection con = null;
		PreparedStatement pstmt1 = null;
		PreparedStatement pstmt2 = null;
		ResultSet rs1 = null;
		ResultSet rs2 = null;
		String sql1 = "select count(*) from sangpum";
		String sql2 = "select * from sangpum order by code";

		try {
			con = connectDB();
			pstmt1 = con.prepareStatement(sql1);
			rs1 = pstmt1.executeQuery();
			rs1.next();
			if (rs1.getInt(1) == 0)
				System.out.println("\n����� ��ǰ������ �����ϴ�.\n");
			else {
				pstmt2 = con.prepareStatement(sql2);
				rs2 = pstmt2.executeQuery();

				System.out.println();
				System.out.println("\n��ǰ�ڵ�\t��ǰ�� \t����\t�ܰ�\t�ݾ�\t���");
				System.out.println("=========================================================");
				while (rs2.next()) {
					System.out.print(rs2.getString("code") + "\t");
					System.out.print(rs2.getString("irum") + "\t");
					System.out.print(rs2.getString("count") + "\t");
					System.out.print(rs2.getString("price") + "\t");
					System.out.print(rs2.getString("sum") + "\t");
					System.out.print(rs2.getString("grade") + "\n");
				}

				System.out.println("==========================================================\n");
			}
		} catch (Exception e) {
			System.out.println("\n �����ͺ��̽� ���� ����! +" + e.getMessage());
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

	static void search_sangpum() {
		Sangpum obj = new Sangpum();
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from sangpum where code = ?";
		Connection con = null;
		try {
			Scanner scan = new Scanner(System.in);
			System.out.print("\n��ȸ�� ��ǰ�ڵ� �Է� =>");
			String code = scan.next();
			con = connectDB();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, code);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				System.out.println();
				System.out.println("\n��ǰ�ڵ�\t��ǰ�� \t����\t�ܰ�\t�ݾ�\t���");
				System.out.println("=========================================================");
				System.out.print(rs.getString("code") + "\t");
				System.out.print(rs.getString("irum") + "\t");
				System.out.print(rs.getInt("count") + "\t");
				System.out.print(rs.getInt("price") + "\t");
				System.out.print(rs.getInt("sum") + "\t");
				System.out.println(rs.getString("grade") + "\t");
				System.out.println("=========================================================");

			} else {
				System.out.println("\n����� ��ǰ������ �����ϴ�.\n");
			}

		} catch (Exception e) {
			System.out.println("\n �����ͺ��̽� ���� ����! +" + e.getMessage());
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

	static void update_sangpum() {
		Sangpum obj = new Sangpum();
		PreparedStatement pstmt = null;
		String sql = "Update sangpum Set count = ?,price = ?,sum= ?, grade=? Where code =?";
		Connection con = null;

		try {
			Scanner scan = new Scanner(System.in);

			System.out.print("\n������ ��ǰ�ڵ� �Է� =>");
			obj.code = scan.next();
			System.out.print("���� �� ���� �Է�=> ");
			obj.count = scan.nextInt();
			System.out.print("���� �� �ܰ� �Է�=> ");
			obj.price = scan.nextInt();
			obj.process_sangpum();
			con = connectDB();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, obj.count);
			pstmt.setInt(2, obj.price);
			pstmt.setInt(3, obj.sum);
			pstmt.setString(4, obj.grade);
			pstmt.setString(5, obj.code);
			int res = pstmt.executeUpdate();
			if (res == 1) {
				System.out.println("\n" + obj.code + "��ǰ �����Ϸ�!!");
			} else {
				System.out.println("\n ���������ʴ� ��ǰ�ڵ��Դϴ�.!!" + res);
			}
		} catch (Exception e) {
			System.out.println("\n �����ͺ��̽� ���� ����! +" + e.getMessage());
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

	static void delete_sangpum() {
		Sangpum obj = new Sangpum();
		PreparedStatement pstmt = null;
		String sql = "Delete from sangpum Where code = ?";
		Connection con = null;

		try {
			Scanner scan = new Scanner(System.in);

			System.out.print("������ ��ǰ�ڵ� �Է� => ");
			String code = scan.next();
			con = connectDB();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, code);
			int res = pstmt.executeUpdate();
			if (res == 1) {
				System.out.println("\n��ǰ���� ���� ����!!\n");

			} else {
				System.out.println("\n������ ��ǰ�� �����ϴ�.!!\n");

			}
		} catch (Exception e) {
			System.out.println("\n �����ͺ��̽� ���� ����! +" + e.getMessage());
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

	static void format_sangpum() throws Exception {
		Connection con = null;
		String sql = "Delete from sangpum";
		con = connectDB();
		Statement stmt = con.createStatement();
		ResultSet rset = stmt.executeQuery(sql);
		System.out.println("\n��� ��ǰ�� �����߽��ϴ�.!!\n");

	}

}
