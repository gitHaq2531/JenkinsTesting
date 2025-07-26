package TestingTest;

import java.util.HashSet;

public class Occurance {

	public static void main(String[] args) {
		String s = "abcdabcd";
		HashSet hash = new HashSet();
		for(int i=0;i<s.length();i++) {
			hash.add(s.charAt(i));
			
		}
		for(Object obj: hash) {
			int count =0;
			for(int j=0;j<s.length();j++) {
				if(obj.equals(s.charAt(j))) {
					count++;
				}
			}
			System.out.println(obj+""+count);
			
		}

	}

}
