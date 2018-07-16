package thread;

public class ConsumerMain {

	public static void main(String[] args) {
		Account account = new Account();
		// 이걸 ThreadEx 3과 4에 두 번 만들어 버리면 같은 balance를 공유하는 것이 아니라
		// 생성할 때마다 balance가 새로 생기는 것이기 때문에
		// main문에 한 번만 생성자를 만든다.

		ThreadEx3 th1 = new ThreadEx3(account);
		th1.start();
		ThreadEx4 th2 = new ThreadEx4(account);
		th2.start();
	}
}
