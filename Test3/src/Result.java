import java.util.Scanner;

public class Result {
	public static void main(String args[]) {
	Scanner scanner = new Scanner(System.in);
	
	System.out.println("수식 입력 => ");
	String str= scanner.nextLine();
	String[] val = str.split("");
	
	int fir = Integer.parseInt(val[0]);
	//System.out.println("first: "+fir);
	
	int result=fir;
	for(int i=1; i<val.length; i+=2) {
		String sym= val[i];
		//System.out.println("symbol: "+sym);
		int sec = Integer.parseInt(val[i+1]);
		//System.out.println("second: "+sec);
		
		result = Calculator.calculator(result, sym, sec);
	}
	System.out.println(str+" = "+result);
	}
}
