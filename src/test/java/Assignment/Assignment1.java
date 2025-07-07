package Assignment;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// Verifying if given number is odd
		/*System.out.println("Enter a number:");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(num%2!=0) {
			System.out.println(num+"  is Odd number");
		}
		else {
			System.out.println(num+"  is not odd number");
		}*/
		
		
		// Month name using else if
		/*System.out.println("Enter a number:");
		Scanner s=new Scanner(System.in);
		int num=s.nextInt();
		if(num==1) {
			System.out.println("January");
		}
		else if(num==2) {
			System.out.println("February");
		}
		else if(num==3) {
			System.out.println("March");
		}
		else if(num==4) {
			System.out.println("April");
		}
		else if(num==5) {
			System.out.println("May");
		}
		else if(num==6) {
			System.out.println("June");
		}
		else if(num==7) {
			System.out.println("July");
		}
		else if(num==8) {
			System.out.println("August");
		}
		else if(num==9) {
			System.out.println("September");
		}
		else if(num==10) {
			System.out.println("October");
		}
		else if(num==11) {
			System.out.println("November");
		}
		else if(num==12) {
			System.out.println("December");
		}
		else {
			System.out.println("Invalid number");
		}*/
		
		
		
		
		//COmpare 2 strings using ternary
		System.out.println("Enter a string:");
		Scanner s1=new Scanner(System.in);
		String str1=s1.next();
		System.out.println("Enter another string:");
		Scanner s2=new Scanner(System.in);
		String str2=s2.next();
		
		String output = (str1.equals(str2)) ? "Both strings are equal" : "Different strings";
		System.out.println(output);
		
		
		

	}

}
