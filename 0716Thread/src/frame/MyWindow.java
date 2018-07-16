package frame;

import java.awt.*;

public class MyWindow extends Frame {
	// ������

	public MyWindow() {
		this.setBackground(Color.lightGray);
		setSize(800, 800);
		setLocation(1300, 800);
		setTitle("���� ù��° ������ ���α׷�");

		Panel panel1 = new Panel();

		Button button1 = new Button("��ư");
		button1.setLabel("��ư1");
		// ��ư�� ������ �����ϴ� ������
		// �ٷ� �Ʒ��� ���� ��� �͸� Ŭ������ ���� ���̴�.
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

		Button button2 = new Button("��ư");
		// ��ư�� �ؽ�Ʈ�� �����ϴ� ������
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

		// �г��� �����ӿ� �߰�
		add(panel1);

		setVisible(true);
	}
}
