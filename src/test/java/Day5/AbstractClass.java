package Day5;

abstract class Demo{
	void test() {
		System.out.println("This is a non abstract method");
	}
	abstract void print(); 
		
}

public class AbstractClass extends Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Demo d=new AbstractClass();
		d.print();
		

	}

	@Override
	void print() {
		// TODO Auto-generated method stub
		System.out.println("Implemented the abstract method");
		
	}
	

}
