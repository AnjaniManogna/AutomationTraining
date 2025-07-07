package Day5;

interface Printable{
	void print() ;
}

public class InterfaceEx implements Printable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Printable p=new InterfaceEx();
		p.print();

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
	}

}
