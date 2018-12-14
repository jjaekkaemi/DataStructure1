package list.doublylinkedlist.implementation;

public class Main {

	public static void main(String[] args) {
		DoublyLinkedList numbers = new DoublyLinkedList();
		int x = 0 ;
		numbers.addFirst(10);
		numbers.addLast(20) ;
		numbers.add(1, 1);
		System.out.println(numbers);
		System.out.println(numbers.indexOf(1));
		DoublyLinkedList.ListIterator li = numbers.listIterator() ;
		while(li.hasNext()) {
			int number = (int) li.next() ; 
			if(number == 20) {
				x++ ;
				li.add(3);
			}
		}
		if(x==0) {
			li.remove(20);
		}
		System.out.println(numbers);
	}

}
