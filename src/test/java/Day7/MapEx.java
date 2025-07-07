package Day7;

import java.util.ArrayList;
import java.util.HashMap;

public class MapEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap <Integer,ArrayList<String>> map= new HashMap();
		ArrayList <String> Emp1 = new ArrayList();
		Emp1.add("Manogna");
		Emp1.add("Hyderabad");
		Emp1.add("2023");
		
		ArrayList <String> Emp2 = new ArrayList();
		Emp2.add("Deepthi");
		Emp2.add("Chennai");
		Emp2.add("2021");
		
		ArrayList <String> Emp3 = new ArrayList();
		Emp3.add("Ram");
		Emp3.add("Bangalore");
		Emp3.add("2022");
		
		map.put(101, Emp1);
		map.put(102, Emp2);
		map.put(103, Emp3);
		
		System.out.println(map.get(101));
		System.out.println(map.get(102));
		System.out.println(map.get(103));
		
		for(int i : map.keySet()) {
			System.out.println(i+ "-->"+map.get(i));
		}

	}

}
