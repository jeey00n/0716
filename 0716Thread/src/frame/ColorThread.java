package frame;

import java.awt.Button;
import java.awt.Color;

public class ColorThread extends Thread {
	private Button button;

	public ColorThread(Button button) {
		this.button = button;
	}

	public void run() {
		//색상 배열을 생성
		Color [] colors = {Color.red, Color.blue, Color.green, Color.white, Color.gray};
		int idx = 0;
		while(true) {
			try {
				//colors 배열 안의 값만 선택하기
				idx = idx + 1;
				button.setBackground(colors[idx%colors.length]);
				Thread.sleep(800);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
