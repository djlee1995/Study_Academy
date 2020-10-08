
class SharedArea1 {
	Account account1;
	Account account2;

	synchronized void transfer(int amount) {

		account1.withdraw(1000000);
		System.out.println("ÀÌ¸ù·æ °èÁÂ: 100¸¸¿ø ÀÎÃâ,");
		account2.deposit(1000000);
		System.out.println("¼ºÃáÇâ °èÁÂ: 100¸¸¿ø ÀÔ±İ");

	}

	synchronized int getTotal() {

		return account1.balance + account2.balance;

	}
}
