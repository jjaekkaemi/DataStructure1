package compare;

import list.arraylist.implementation.ArrayList;
import list.linkedlist.implementation.LinkedList;

public class main {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();//arraylist�� ���� �������ִ�. �ڹٿ����� ���������� ����� ��� �Ҵ�ɶ� �ڵ����� 2�� �����ȴ�.
		a.addLast(10) ;
		a.addLast(20) ;
		a.addLast(30) ;
		a.addFirst(5) ;//array ������ �� �ű� �� �����͸� �߰� �ؾ� �Ѵ�.
		a.get(2) ;//array�� �ּҰ��� �̿��Ͽ� ���� �ӵ��� ������ �����͸� ã�� �� �ִ�.
		ArrayList.ListIterator ai = a.listIterator();
		while(ai.hasNext()) {
			if((int) ai.next()==20) {
				ai.add(25);
			}
		}
		LinkedList b = new LinkedList();
		b.addLast(10);
		b.addLast(20);
		b.addLast(30);
		b.addFirst(5);//�������� �ٲ㼭 �����Ͱ� �߰��Ǳ� ������ ������.
		b.get(2) ;//ù list���� ã�ƾ� �ϹǷ� �ӵ��� ������.
		LinkedList.ListIterator li = b.listIterator() ;//�����͸� �߰��ϴ� ��� arraylist���� �ξ� ������ ó����.
		while(li.hasNext()) {
			if((int) li.next()==20) {
				li.add(25);
			}
		}
	}
}
