package thread;

public class MutexMain {

	public static void main(String[] args) {
		Bank bank = new Bank();
		//스레드 인스턴스 만들기
		BankThread atm = new BankThread(bank, "ATM");
		atm.start();
		BankThread internet = new BankThread(bank, "internet");
		internet.start();
	}
}
