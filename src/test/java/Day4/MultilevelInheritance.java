package Day4;

class GrandParent{
	void grandparentmethod() {
		System.out.println("This is Grandparent class method");
	}
}

class Parent1 extends GrandParent {
	void parentClassMethod() {
		System.out.println("This is the parent class method");
	}
}

class Child1 extends Parent1 {
	void childclassMethod() {
		System.out.println("This is the child class method");
	
	}
}

public class MultilevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Child1 c = new Child1();
		c.childclassMethod();
		c.grandparentmethod();
		c.parentClassMethod();
		Parent1 p=new Parent1();
		p.grandparentmethod();
		p.parentClassMethod();

	}

}
