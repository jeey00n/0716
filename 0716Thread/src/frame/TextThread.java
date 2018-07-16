package frame;

import java.awt.Button;

public class TextThread extends Thread {
	private Button button;

	public TextThread(Button button) {
		this.button = button;
	}

	public void run() {
		//���� �迭�� ����
		String [] texts = {"Java", "Oracle", "FrontEnd", "BackEnd", "Android"};
		int idx = 0;
		while(true) {
			try {
				//colors �迭 ���� ���� �����ϱ�
				idx = idx + 1;
				button.setLabel(texts[idx%texts.length]);
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
