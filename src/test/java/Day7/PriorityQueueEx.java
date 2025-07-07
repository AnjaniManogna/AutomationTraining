package Day7;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue <String> s= new PriorityQueue();
		
		s.add("Selenium");
		s.add("cucmber");
		s.add("Training");
		s.add("Selenium");
		
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println(s);
		System.out.println(s.element());
		s.poll();
		System.out.println(s);
	

	}

}
