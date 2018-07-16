package thread;

public class ThreadMain1 {

	public static void main(String[] args) {
		//클래스의 run메소드 사용
		ThreadEx1 te1 = new ThreadEx1();
		//데몬스레드로 설정
		//다른 스레드가 작업 중이 아니라면 자동 종료
		te1.setDaemon(true);
		te1.start();
		try {
			Thread.sleep(2000);
			//InterruptedException을 발생시킨다.
			te1.interrupt();
			Thread.sleep(3000);
			System.out.println("메인 종료");
			//프로그램 종료
			//System.exit(0);
		} catch (InterruptedException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
}
