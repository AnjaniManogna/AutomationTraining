package Day6;

import java.util.Stack;

public class StackEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack <String> s=new Stack();
		s.add("Deepthi");
		s.push("Selenium");
		s.push("Java");
		s.add("Manu");
		s.push("Training");
		
		System.out.println(s);
		s.pop();
		System.out.println(s);
		System.out.println(s.peek());

	}

}
