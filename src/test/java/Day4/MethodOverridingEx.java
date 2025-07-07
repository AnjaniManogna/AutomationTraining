package Day4;

class RBI{
	void rateOfInterest() {
		System.out.println("8%");
	}
}

class SBI extends RBI{
	void rateOfInterest() {
		System.out.println("8.4%");
	}
}

public class MethodOverridingEx {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SBI s=new SBI();
		s.rateOfInterest();
		

	}

}
