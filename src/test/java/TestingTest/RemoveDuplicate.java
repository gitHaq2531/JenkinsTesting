package TestingTest;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String s = "hello hi how hello hi are you";
		String[] word=s.split(" ");
		for(int i =0;i<word.length;i++) {
			boolean flag = false;
			for(int k=0;k<i;k++) {
				if(word[i].equals(word[k])) {
					flag=true;
				}
			}
			if(flag)continue;
			System.out.print(word[i]+" ");
		}

	}

}
