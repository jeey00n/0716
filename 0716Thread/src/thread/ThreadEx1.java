package thread;

public class ThreadEx1 extends Thread {
	// 스레드로 동작할 메소드
	public void run() {
		// 1초마다 Thread라는 글자를 10번 출력
		int i = 0;
		while (i < 10) {
			System.out.println("Thread");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println("스레드 종료");
				//스레드를 강제종료할 수 있도록 예외가 발생하면 run메소드를 종료
				//실무에서는 항상 스레드예외처리에 return을 넣어서 언제든 종료시킬 수 있어야 한다.
				return;
				}
			i++;
		}
	}
}