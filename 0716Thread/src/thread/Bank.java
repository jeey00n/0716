package thread;

public class Bank {
	// 잔액을 저장할 변수
	private int balance = 1000;

	// 잔액을 변경하는 메소드
	public void job(String msg) {
		//this- 내 자신의 자원을 수행하는 경우 이 코드는 한 번에 수행되도록 설정.
		//synchronized를 붙이지 않으면 ATM스레드가 작업하고 있는 도중에
		//internet스레드가 작업을 수행해서 결과가 이상하게 나옴.
		//작업 전 잔액과 작업 후 잔액의 차이가 100이 되어야 하는데 200이 나는 경우 발생.
		//이런 경우에는 작업 내에서 공유 자원을 사용하는 부분은 한번에 수행되도록 해야 함.
		synchronized (this) {
			System.out.println("현재 잔액: " + balance);
			balance = balance - 100;
			System.out.println(msg + "작업 후 현재 잔액: " + balance);
			// 1초 대기
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
