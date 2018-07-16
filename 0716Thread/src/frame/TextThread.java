package frame;

import java.awt.Button;

public class TextThread extends Thread {
	private Button button;

	public TextThread(Button button) {
		this.button = button;
	}

	public void run() {
		//색상 배열을 생성
		String [] texts = {"Java", "Oracle", "FrontEnd", "BackEnd", "Android"};
		int idx = 0;
		while(true) {
			try {
				//colors 배열 안의 값만 선택하기
				idx = idx + 1;
				button.setLabel(texts[idx%texts.length]);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
