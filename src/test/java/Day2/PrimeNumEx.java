package Day2;

import java.util.Scanner;

public class PrimeNumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Scanner s=new Scanner(System.in); System.out.println("Enter a number:"); int
		 * num=s.nextInt(); boolean isPrimenum = true; if(num ==0 || num==1) {
		 * System.out.println("Given number is not Prime number"); } else { for(int i
		 * =2;i<=num/2;i++) { if(num%i==0) {
		 * System.out.println("Given number is not a prime number"); isPrimenum = false;
		 * break; } } if(isPrimenum) {
		 * System.out.println("Given number is a prime number"); } }
		 */
		
		Scanner sc = new Scanner(System.in); 
        System.out.println("Please enter the number:");
        int number = sc.nextInt();
        boolean isPrime = true;


        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= number / 2; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }


        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }


        sc.close();
	}

}
