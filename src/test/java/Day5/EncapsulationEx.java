package Day5;

class Account{
	private long accountno;
	public long getAccountno() {
		return accountno;
	}
	public void setAccountno(long accountno) {
		this.accountno = accountno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	private String name,email;
}
public class EncapsulationEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a=new Account();
		a.setAccountno(1234);
		a.setName("Manogna");
		a.setEmail("man@gmail.com");
		System.out.println(a.getAccountno()+" "+a.getName()+ " "+a.getEmail());

	}

}
