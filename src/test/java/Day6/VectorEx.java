package Day6;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class VectorEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> l= new Vector();
		l.add("Java");
		l.add("Automation");
		l.add("Automation");
		l.add("Selenium");
		l.add("Deepthi");
		
		Iterator itr = l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
