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
		System.out.println(numbers.indexOf(40)); //20�� ���� index�� ����ΰ�.
		//for(int i = 0 ; i<numbers.size(); i++) {
			//System.out.println(numbers.get(i));
		//}
		ArrayList.ListIterator li = numbers.listIterator(); /*ArrayList Ŭ���� �ȿ� �ִ� ListIterator Ŭ���� */ 
		while(li.hasNext()) {//true��� �� ��� ũ�Ⱑ 100���� �������� �� �̻��� �Ѿ� ������ ���Ե�. 
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
