package frame;

import java.awt.*;

public class MyWindow extends Frame {
	// 생성자

	public MyWindow() {
		this.setBackground(Color.lightGray);
		setSize(800, 800);
		setLocation(1300, 800);
		setTitle("나의 첫번째 윈도우 프로그램");

		Panel panel1 = new Panel();

		Button button1 = new Button("버튼");
		button1.setLabel("버튼1");
		// 버튼의 배경색을 변경하는 스레드
		// 바로 아래의 문장 대신 익명 클래스를 만들 것이다.
		// ColorThread th1 = new ColorThread(button1);
		Thread th1 = new Thread() {
			public void run() {
				Color[] colors = { Color.red, Color.blue, Color.green, Color.white, Color.gray };
				int idx = 0;
				while (true) {
					try {
						Thread.sleep(1000);
						idx = idx + 1;
						button1.setBackground(colors[idx % colors.length]);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		th1.start();
		panel1.add(button1);

		Button button2 = new Button("버튼");
		// 버튼의 텍스트를 변경하는 스레드
		// TextThread th2 = new TextThread(button2);
		Thread th2 = new Thread() {
			public void run() {
				String[] texts = { "Java", "Oracle", "FrontEnd", "BackEnd", "Android" };
				int idx = 0;
				while(true) {
					try {
						Thread.sleep(1000);
						idx = idx + 1;
						button2.setLabel(texts[idx%texts.length]);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		th2.start();
		button2.setBackground(Color.black);
		button2.setForeground(Color.white);

		panel1.add(button2);

		// 패널을 프레임에 추가
		add(panel1);

		setVisible(true);
	}
}
