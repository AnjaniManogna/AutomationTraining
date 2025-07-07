package Assignment;

import java.util.Scanner;

public class Assignment2 {

	public static void main(String[] args) {
		// arithmetic operations using switch-case
		
		System.out.println("Enter 1st number:");
		Scanner s1=new Scanner(System.in);
		int a=s1.nextInt();
		System.out.println("Enter 2nd number:");
		Scanner s2=new Scanner(System.in);
		int b=s2.nextInt();
		
		System.out.println("Enter the operation you would like to perform(1-addition,2-subtraction,3-multiplication,4-division):");
		Scanner s3=new Scanner(System.in);
		int op=s3.nextInt();
		
		switch(op) {
		case 1: {
			System.out.println("Sum of given numbers is "+ (a+b) );
			break;
		}
		case 2:{
			System.out.println("Difference of given numbers is "+ (a-b) );
			break;
		}
		case 3:{
			System.out.println("Product of given numbers is "+ (a*b) );
			break;
		}
		case 4:{
			System.out.println("Quotient of given numbers is "+ (a/b) );
			break;
		}
		default: System.out.println("Operation doesn't exist");
		}

	}

}
