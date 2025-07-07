package Assignment;

public class CharacterCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="SeleniumSele";
		char[] r= s.toCharArray();
		for(int i=0;i<r.length;i++) {
			int count=1;
			for(int j=i+1;j<r.length;j++) {
				if(r[i]==r[j]) {
					count+=1;
					r[j]='p';
				}
			}
			if(r[i]!='p') {
				System.out.println(r[i]+"-->"+count);
			}
			
		}
		

	}

}
