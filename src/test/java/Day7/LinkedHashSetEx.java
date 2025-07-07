package Day7;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set <String> s= new LinkedHashSet();
		s.add("Java");
		s.add("Java");
		s.add(null);
		s.add(null);
		s.add("cucumber");
		
		System.out.println(s);
		s.remove("cucumber");
		s.add("Python");
		System.out.println(s);

	}

}
