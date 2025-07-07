package Day8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConvertListtoSetSettoList {
	
	public static void main(String[] args) {
		List <String> l= Arrays.asList("Java", "Selenium", "Training","Java");
		Set <String> s= new HashSet(l);
		System.out.println(s);
		
		List l1= new ArrayList(s);
		System.out.println(l1);
		
		
	}

}
