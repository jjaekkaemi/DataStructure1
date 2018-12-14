package list.linkedlist.implementation;

public class LinkedList {
	private Node head;
	private Node tail;
	private int size = 0 ;
	
	private class Node{
		private Object data;
		private Node next ;
		public Node(Object input) {
			this.data = input ;
			this.next = null ;
		}
		public String toString() {
			return String.valueOf(this.data) ;
		}
	}

	public void addFirst(Object i) {
		Node newNode = new Node(i) ;
		newNode.next = head ;//head값을 참조한다는 의미.
		head = newNode ;
		size++ ;
		if(head.next==null) {
			tail = head ;
		}
	}

	public void addLast(Object i) {
		Node newNode = new Node(i) ;
		if(size == 0) {
			addFirst(i) ;
		}
		else {
			tail.next = newNode ;
			tail = newNode ;
			size++ ;
		}
		
	}
	Node node(int i) {
		Node x = head ;
		for(int z=0 ; z < i ; z++) {
			x = x.next ;
		}
		return x ;
	}

	public void add(int i, Object j) {
		if(i == 0 ) {
			addFirst(j) ;
		}
		else if(i+1 == size-1){
			addLast(j) ;
		}
		else {
			Node x = node(i-1) ;
			Node y = node(i) ;
			Node newNode = new Node(j) ;
			x.next = newNode ;
			newNode.next = y ;
			size++ ;
			if(newNode.next == null) {
				tail = newNode ;
			}
		}
	}
	public String toString() {
		String s = "[" ;
		for(int i = 0 ; i<size ; i++) {
			if(i==size-1) {
				s = s+node(i) ;
			}
			else s = s + node(i) + "," ;
		}
		s = s + "]" ;
		return s ; 
	}

	public void removeFirst() {
		Node x = node(0) ;
		x = head ;
		head = head.next ;
		Object returnData = x.data ;
		x = null ;
		size-- ;
	}
	public void remove(int i) {
		if(i==0) {
			removeFirst() ;
		}
		/*else if(i+1 == size-1){
			removeLast() ;
		}*/
		else {
			Node x = node(i) ;
			Node y = node(i-1) ;
			Node z = node(i+1) ;
			y.next = z ;
			Object returnData = x.data ;
			if(y == tail) {
				tail = x ;
			}
			x = null ;
			size-- ;
		}
	}
	/*public void removeLast() {
		Node x = node(size-2) ;
		Node y = x.next ;
		tail = x ; 
		Object returnData = y ; 
		y = null ;
		size-- ;
	} OR remove(size-1) ;
	*/
	public int size() {
		return size ;
	}
	public Object get(int i) {
		Node x = node(i) ;
		return x.data ;
	}
	public int indexOf(Object x) {
		for(int i = 0 ; i<size ; i++) {
			Node temp = node(i) ;
			if(temp.data==x) {
				return i ;
			}
		}
		return -1 ;
	}
	public ListIterator listIterator() {
		return new ListIterator() ;
	}
	
	public class ListIterator{
		private Node next ;
		private Node lastReturned ;
		private int nextIndex = 0;
		ListIterator(){
			next = head ;
		}
		public Object next() {
			lastReturned = next ;
			next = next.next ;
			nextIndex++ ;
			return lastReturned.data ;
		}
		public boolean hasNext() {
			return nextIndex < size() ; 
		}
		public void add(Object i) {
			LinkedList.this.add(nextIndex++, i) ;
		}
		public void remove(Object i) {
			int x = LinkedList.this.indexOf(i) ;
			if(x>-1) {
				LinkedList.this.remove(x) ;
			}
		}
	}
}
