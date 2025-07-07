package Day6;

import java.util.List;

public class ArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  List <String> l= new java.util.ArrayList<String>(); l.add("Manogna");
		  l.add("Manogna"); l.add(null); l.add("Selenium"); l.add(null);
		  
		  for(int i=0;i<l.size();i++) { System.out.println(l.get(i)); }
		 
		List <Object> o= new java.util.ArrayList();
		o.add(20);
		o.add("Java");
		o.add(20.4);
		o.add(true);
		o.add('r');
		o.add(3, "Manu");
		
		for(int i=0;i<o.size();i++) {
			System.out.println(o.get(i));
		}
		
		o.remove(2);
		o.remove("r");
		
		System.out.println(o);

	}

}
