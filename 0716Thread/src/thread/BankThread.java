package thread;

public class BankThread extends Thread {
	private Bank bank;
	private String name;

	// 생성자에서 Bank와 문자열 1개를 대입
	public BankThread(Bank bank, String name) {
		this.bank = bank;
		this.name = name;
	}

	// 스레드로 동작할 메소드
	public void run() {
		for(int i = 0; i<3; i++) {
			bank.job(name);
		}
	}
}
