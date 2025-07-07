package Assignment;

import java.util.Scanner;

public class SumOfOddNum {

	public static void main(String[] args) {
		// sum of all odd numbers between 1 and 100
		/*
		 * int sum=0; for(int i=1;i<=100;i++) { if(i%2!=0) { sum+=i; }
		 * 
		 * } System.out.println(sum);
		 */

		
		//sum of all array elements
		/*
		 * int[] a= {54,3,57,9,2,45}; int sum=0; for(int i:a) { sum+=i; }
		 * System.out.println(sum);
		 */
		
		
		//Calculate electricity bill
//		if (a<=50) {
//			bill=a*0.50;
//		}
//		else if(a<=200) {
//			bill=((50*0.5)+(a-50)*0.75);
//		}
//		else if(a<=550) {
//			bill=((50*0.5)+150*0.75+a*1.20);
		System.out.println("Enter electricity units:");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		double bill=0;
		if (a<=50) {
			bill=a*(0.50);
		}
		else if(a<=150) {
			bill=(a*0.75);
		}
		else if(a<=250) {
			bill=(a*1.20);
		}
		else if(a>250) {
			bill=(a*1.5);
		}
		bill=bill+(bill/5);
		System.out.println(bill);
	}


}
