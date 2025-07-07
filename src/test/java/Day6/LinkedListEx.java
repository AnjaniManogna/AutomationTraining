package Day6;

import java.util.LinkedList;
import java.util.List;

public class LinkedListEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> l= new LinkedList();
		l.add("Java");
		l.add("Automation");
		l.add("Automation");
		l.add("Selenium");
		l.add("Deepthi");
		
		System.out.println(l);
		
		l.set(3, "Cypress");
		
		System.out.println(l);

	}

}
