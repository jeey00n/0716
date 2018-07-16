package thread;

public class ThreadEx3 extends Thread {
	private Account account;

	public ThreadEx3(Account account) {
		this.account = account;
		//this는 인스턴스의 주소다. th1이 되는 것.
		//this는 1. 지역변수와 인스턴스 변수를 구분할 때
		//2. 자기 자신을 사용하고자 하는 경우 두 가지로 사용함.
	}

	public void run() {
		for (int i = 0; i < 5; i++) {
			account.save();
		}
	}

}
