package frame;

import java.awt.*;

public class ComponentTest extends Frame {
	public ComponentTest() {
		setTitle("체크박스 테스트");
		setLocation(1300, 800);
		setSize(800, 800);

		Panel p = new Panel();

		Checkbox cb1 = new Checkbox("독서");
		Checkbox cb2 = new Checkbox("눕기");
		Checkbox cb3 = new Checkbox("게임");
		Checkbox cb4 = new Checkbox("노래하기");

		cb1.setSize(50, 50);
		cb2.setSize(50, 50);
		cb3.setSize(50, 50);
		cb4.setSize(50, 50);
		
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		p.add(cb4);

		// 라디오 버튼 만들기
		CheckboxGroup group = new CheckboxGroup();
		Checkbox man = new Checkbox("남자", group, true);
		Checkbox woman = new Checkbox("여자", group, false);

		Choice ch = new Choice();
		ch.add("봄");
		ch.add("여름");
		ch.add("가을");
		ch.add("겨울");
		p.add(ch);

		p.add(man);
		p.add(woman);
		
		//5줄을 보여주고, 여러 개를 선택할 수 있도록 해주는 List.
		//true를 주면 여러 개를 선택할 수 있다.
		List list = new List(5, true);
		list.add("Java");
		list.add("C++");
		list.add("Oracle");
		list.add("Android");
		list.add("A");
		list.add("B");
		list.add("C");
		list.add("D");
		list.add("E");
		list.add("F");
		list.add("G");
		
		p.add(list);
		
		//list의 remove(int idx)를 이용하면 idx번째를 지울 수 있다.
		//list.remove(2);
		//첫 번째에 있는 Java와 5번째에 있는 A를 지워 본다.
		//list.remove(0);	-> list.remove(4);
		//첫 번째를 지웠기 때문에 A가 4번째 위치로 당겨졌다.
		//그 상태에서 5번째를 지우면 A가 아니라 B가 지워진다.

		
		//뒤의 것을 먼저 지운 후 앞의 것을 지우는 게 더 편하다.
		//뒤의 것을 지워도 앞의 index에는 영향을 주지 않기 때문에..
		list.remove(4); 	list.remove(0);
		
		add(p);
		setVisible(true);
	}
}
