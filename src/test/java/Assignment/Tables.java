package Assignment;

import java.util.Scanner;

public class Tables {

	public static void main(String[] args) {
		// Table for a given number
		System.out.println("Enter a number:");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		
		while(a>0) {
			for(int i=1;i<=10;i++) {
				System.out.println(a+ " x "+i+" = "+a*i);
			}
			break;

		}

	}

}
