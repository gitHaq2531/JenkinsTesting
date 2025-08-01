package TestingTest;

public class StringSum {

	public static void main(String[] args) {
		String s ="akshay";
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
				char ch = (char)(s.charAt(i)-32);
				System.out.print(ch);
			}else {
				System.out.print(s.charAt(i));
			}
		}
		
		
	}

}
