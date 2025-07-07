package Day4;

class Parent {
	void parentClassMethod() {
		System.out.println("This is the parent class method");
	}
}

class Child extends Parent {
	void childclassMethod() {
		System.out.println("This is the child class method");
	
	}
}

public class SingleInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child c=new Child();
		Parent p=new Parent();
		c.childclassMethod();
		c.parentClassMethod();
		p.parentClassMethod();
		

	}

}
