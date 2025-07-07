package Day2;

public class SumofOddNumEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for (int i=1;i<=100;i++) {
			if(i%2!=0) {
				sum=sum+i;
			}
		}
		System.out.println("Sum of Odd numbers from 1 to 100 is"+sum);

	}

}
