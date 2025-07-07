package Day1;

import java.util.Scanner;

public class ScanerClassEx {
	

	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Username:");
		String username = s.nextLine();
		System.out.println("Enter RollNum:");
		int rollnum = s.nextInt();
		System.out.println("Your name is: "+username);
		System.out.println("Your rollnumber is: "+rollnum);
		
				}
}
