package compare;

import list.arraylist.implementation.ArrayList;
import list.linkedlist.implementation.LinkedList;

public class main {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();//arraylist는 값이 정해져있다. 자바에서는 내부적으로 사이즈가 모두 할당될때 자동으로 2배 증가된다.
		a.addLast(10) ;
		a.addLast(20) ;
		a.addLast(30) ;
		a.addFirst(5) ;//array 공간을 다 옮긴 후 데이터를 추가 해야 한다.
		a.get(2) ;//array의 주소값을 이용하여 같은 속도로 빠르게 데이터를 찾을 수 있다.
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
		b.addFirst(5);//연결점만 바꿔서 데이터가 추가되기 때문에 빠르다.
		b.get(2) ;//첫 list부터 찾아야 하므로 속도가 느리다.
		LinkedList.ListIterator li = b.listIterator() ;//데이터를 추가하는 경우 arraylist보단 훨씬 빠르게 처리됨.
		while(li.hasNext()) {
			if((int) li.next()==20) {
				li.add(25);
			}
		}
	}
}
