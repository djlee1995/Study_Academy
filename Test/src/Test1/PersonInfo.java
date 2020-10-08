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
		System.out.print("학번 입력 => ");
		hakbun = in.next();
		if (hakbun.toLowerCase().equals("exit"))
			return true;
		System.out.print("이름을 입력=> ");
		this.irum = in.next();
		System.out.print("주소를 입력=> ");
		this.addr = in.next();
		System.out.print("전화번호를 입력=> ");
		this.phone = in.next();
		System.out.print("이메일을 입력=> ");
		this.email = in.next();
		
		return false;
	}
	public void output() {
		System.out.printf("%4s %3s %4s %12s %s\n",
				hakbun,irum,addr,phone,email);
		
	}
}
