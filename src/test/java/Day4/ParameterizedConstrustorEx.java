package Day4;

public class ParameterizedConstrustorEx {
	int rollno;
	String studentName;
	
	ParameterizedConstrustorEx(int i,String s){
		rollno=i;
		studentName=s;
	}
	
	void display() {
		System.out.println(rollno+"--"+studentName);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterizedConstrustorEx p= new ParameterizedConstrustorEx(1,"Manogna");
		ParameterizedConstrustorEx q= new ParameterizedConstrustorEx(2,"Selenium");
		p.display();
		q.display();

	}

}
