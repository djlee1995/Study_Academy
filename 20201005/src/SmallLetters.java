
class SmallLetters implements Runnable {
	public void run() {
		for (char ch = 'a'; ch <= 'z'; ch++)
			System.out.print(ch);
	}
}
