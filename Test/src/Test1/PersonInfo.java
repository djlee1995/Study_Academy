package Test1;

import java.util.Scanner;

public class PersonInfo extends Person implements Personable {
	String addr;
	String phone;
	String email;

	PersonInfo() {

	}

	public boolean input() {
		Scanner in = new Scanner(System.in);
		System.out.print("�й� �Է� => ");
		hakbun = in.next();
		if (hakbun.toLowerCase().equals("exit"))
			return true;
		System.out.print("�̸��� �Է�=> ");
		this.irum = in.next();
		System.out.print("�ּҸ� �Է�=> ");
		this.addr = in.next();
		System.out.print("��ȭ��ȣ�� �Է�=> ");
		this.phone = in.next();
		System.out.print("�̸����� �Է�=> ");
		this.email = in.next();
		
		return false;
	}
	public void output() {
		System.out.printf("%4s %3s %4s %12s %s\n",
				hakbun,irum,addr,phone,email);
		
	}
}
