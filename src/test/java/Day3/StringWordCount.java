package Day3;

public class StringWordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="String and String function to create String function";
		String[] r= s.split(" ");
		for(int i=0;i<r.length;i++) {
			int count=1;
			for(int j=i+1;j<r.length;j++) {
				if(r[i].equals(r[j])) {
					count+=1;
					r[j]="repeated";
				}
			}
			if(r[i]!="repeated") {
				System.out.println(r[i]+"-->"+count);
			}
			
		}
		

	}

}
