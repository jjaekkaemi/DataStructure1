package list.linkedlist.implementation;

public class Main {

	public static void main(String[] args) {
		LinkedList numbers = new LinkedList();
		int x = 0 ;
		numbers.addLast(10) ;
		numbers.addLast(20) ;
		numbers.add(2, 1);
		//numbers.remove(0) ;
		//numbers.remove(1);
		//numbers.removeLast() ;
		//numbers.removeLast() ;
		//numbers.removeLast() ;
		System.out.println(numbers);
		System.out.println(numbers.indexOf(1));
		LinkedList.ListIterator li = numbers.listIterator() ;
		while(li.hasNext()) {
			int number = (int) li.next() ; 
			if(number == 21) {
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
