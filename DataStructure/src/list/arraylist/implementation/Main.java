package list.arraylist.implementation;

public class Main {
	public static void main(String[] args) {
		ArrayList numbers = new ArrayList();
		int x = 0 ;
		numbers.addLast(10) ;
		numbers.addLast(20) ;
		numbers.addLast(30) ;
		numbers.addLast(40) ;
		//numbers.remove(1) ;
		//numbers.removeFirst() ;
		//numbers.removeLast() ;
		System.out.println(numbers.get(1));
		System.out.println(numbers);
		System.out.println(numbers.size()) ;
		System.out.println(numbers.indexOf(40)); //20을 가진 index는 몇번인가.
		//for(int i = 0 ; i<numbers.size(); i++) {
			//System.out.println(numbers.get(i));
		//}
		ArrayList.ListIterator li = numbers.listIterator(); /*ArrayList 클레스 안에 있는 ListIterator 클레스 */ 
		while(li.hasNext()) {//true라고 할 경우 크기가 100으로 정해져서 그 이상이 넘어 오류가 나게됨. 
			System.out.println(li.next());
		}
		while(li.hasPrevious()){
			System.out.println(li.previous());
		}
		while(li.hasNext()) {
			int number = (int)li.next();
			if(number == 50) {
				x++ ;
				li.add(35);
			}
		}
		if(x==0) li.remove(30); 
		System.out.println(numbers);
	}
	

}
