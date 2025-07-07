package Day7;

import java.util.HashMap;
import java.util.Map;

public class CharCountUsingHashMap {
	public void numberOfOccurenceOfaCharacter(String str) {
		HashMap <Character,Integer> hs= new HashMap();
		char[] ch= str.toCharArray();
		for(char c: ch) {
			if(hs.containsKey(c)) {
				hs.put(c, hs.get(c)+1);
			}
			else {
				hs.put(c, 1);
			}
		}
		for(Map.Entry entry: hs.entrySet() ) {
			System.out.println(entry.getKey()+"-->"+entry.getValue());
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CharCountUsingHashMap a= new CharCountUsingHashMap();
		a.numberOfOccurenceOfaCharacter("SeleniumSele");
		

	}

}
