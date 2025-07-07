package Day4;

class ParentOne {
	void parentClassMethod() {
		System.out.println("This is the parent class method");
	}
}

class ParentTwo {
	void parentClassMethod() {
		System.out.println("This is the parent2 class method");
	}
}

class ChildOne extends ParentOne {
	void childclassMethod() {
		System.out.println("This is the child1 class method");
	
	}
}

class ChildTwo extends ParentOne {
	void childclassMethod() {
		System.out.println("This is the child2 class method");
	
	}
}

public class HierarchialInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildOne c=new ChildOne();
		c.childclassMethod();
		c.parentClassMethod();
		
		ChildTwo p=new ChildTwo();
		p.childclassMethod();
		p.parentClassMethod();

	}

}
