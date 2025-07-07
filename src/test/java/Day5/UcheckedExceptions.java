package Day5;

import java.util.Scanner;

public class UcheckedExceptions {

	public static void main(String[] args) {
		// Example1
		
		  System.out.println("Program Started...");
		  System.out.println("Enter a number:"); 
		  Scanner s=new Scanner(System.in); 
		  
		  int n=s.nextInt();
		  try {
		  System.out.println(100/n);
		  }
		  catch(Exception e)
		  {
			  System.out.println(e.getMessage());
		  }
		

		  System.out.println("Program executed");
		  System.out.println("Program completed");
		 
		
		//Example2
		/*
		 * System.out.println("Program Started...");
		 * System.out.println("Enter a position between 0 to 4:"); int[] a=new int[5];
		 * Scanner s=new Scanner(System.in); int position=s.nextInt();
		 * System.out.println("Please enter the value:"); int value=s.nextInt();
		 * System.out.println(a[position]=value);
		 * System.out.println("Program executed");
		 * System.out.println("Program completed");
		 */
		
		//Example3
		/*
		 * String s="manogna"; int c=Integer.parseInt(s); System.out.println(c);
		 */
		
		
		//Example4
		/*
		 * String s1=null; System.out.println(s1.length());
		 */
		
	}

}
