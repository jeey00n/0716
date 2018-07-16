package frame;

import java.awt.*;

public class ComponentTest extends Frame {
	public ComponentTest() {
		setTitle("üũ�ڽ� �׽�Ʈ");
		setLocation(1300, 800);
		setSize(800, 800);

		Panel p = new Panel();

		Checkbox cb1 = new Checkbox("����");
		Checkbox cb2 = new Checkbox("����");
		Checkbox cb3 = new Checkbox("����");
		Checkbox cb4 = new Checkbox("�뷡�ϱ�");

		cb1.setSize(50, 50);
		cb2.setSize(50, 50);
		cb3.setSize(50, 50);
		cb4.setSize(50, 50);
		
		p.add(cb1);
		p.add(cb2);
		p.add(cb3);
		p.add(cb4);

		// ���� ��ư �����
		CheckboxGroup group = new CheckboxGroup();
		Checkbox man = new Checkbox("����", group, true);
		Checkbox woman = new Checkbox("����", group, false);

		Choice ch = new Choice();
		ch.add("��");
		ch.add("����");
		ch.add("����");
		ch.add("�ܿ�");
		p.add(ch);

		p.add(man);
		p.add(woman);
		
		//5���� �����ְ�, ���� ���� ������ �� �ֵ��� ���ִ� List.
		//true�� �ָ� ���� ���� ������ �� �ִ�.
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
		
		//list�� remove(int idx)�� �̿��ϸ� idx��°�� ���� �� �ִ�.
		//list.remove(2);
		//ù ��°�� �ִ� Java�� 5��°�� �ִ� A�� ���� ����.
		//list.remove(0);	-> list.remove(4);
		//ù ��°�� ������ ������ A�� 4��° ��ġ�� �������.
		//�� ���¿��� 5��°�� ����� A�� �ƴ϶� B�� ��������.

		
		//���� ���� ���� ���� �� ���� ���� ����� �� �� ���ϴ�.
		//���� ���� ������ ���� index���� ������ ���� �ʱ� ������..
		list.remove(4); 	list.remove(0);
		
		add(p);
		setVisible(true);
	}
}
