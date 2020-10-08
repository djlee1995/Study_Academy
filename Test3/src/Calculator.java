import java.util.*;

public class Calculator {
	static int getFir(Scanner scanner) {
		int fir=scanner.nextInt();
		return fir;
		
	}
	static int getSec(Scanner scanner) {
		int sec=scanner.nextInt();
		return sec;
		
	}
	static String getSym(Scanner scanner) {
		String sym=scanner.next();
		return sym;
		
	}

	static int calculator(int fir, String sym, int sec) {
		int result=0;
		if(sym.equals("+")) {
			result= fir+sec;
		}
		else if(sym.equals("-")) {
			result=fir-sec;
		}
		else if(sym.equals("*")) {
			result=fir*sec;
		}
		else if(sym.equals("/")) {
			result=fir/sec;
		}
		return result;
	}
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int fir = getFir(scanner);
		int result = fir;
		
		while(true) {
			String sym= getSym(scanner);
			int sec = getSec(scanner);
			result = calculator(result, sym, sec);
		}
		
	}
		

	}

