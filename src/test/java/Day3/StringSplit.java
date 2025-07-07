package Day3;

public class StringSplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="This is,comma.fullstop  whitespace";
		String[] r=s.split(" ",2);
		for(String i:r) {
			System.out.println(i);
		}
		String regex="[,\\s\\.]";
		String[] arr=s.split(regex);
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		

	}

}
