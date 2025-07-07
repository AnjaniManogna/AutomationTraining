package Day4;

public class MethodOverloadingEx {
	
	static int add(int a ,int b) {
		return a+b;
	}
	
	static int add(int a ,int b, int c) {
		return a+b+c;
	}
	
	static double add(double a ,double b, double c) {
		return a+b+c;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(add(10, 10));
		System.out.println(add(10.5, 5.5, 2.4));
		System.out.println(add(10, 20, 30));

	}

}
