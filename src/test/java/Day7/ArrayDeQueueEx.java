package Day7;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDeQueueEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque <String> d=new ArrayDeque();
		d.add("Selenium");
		d.add("cucumber");
		d.add("Java");
		d.add("Python");
		d.addFirst("Manu");
		d.addLast("Deepthi");
		
		System.out.println(d);
		System.out.println(d.peekFirst());
		
		d.pollFirst();
		System.out.println(d);
		
		

	}

}
