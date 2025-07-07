package Day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingwithList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List <String> l= new ArrayList<String>();
		l.add("Manogna");
		  l.add("Manogna"); 
		  l.add("Selenium"); 
		  l.add("Java");
		  l.add("Python");
		  l.add("training");
		  Collections.sort(l);
		  System.out.println(l);
		 
		  List <Integer> num= new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8));
		  Collections.reverse(num);
		  System.out.println(num);
	

}
}
