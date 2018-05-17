package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Test_implementation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> li =new LinkedList<Integer>();
		li.add(20);
		li.add(23);
		li.addFirst(19);
		Iterator<Integer> itr = li.iterator();
		for (Integer integer : itr.next()) {
			
		}
	}

}
