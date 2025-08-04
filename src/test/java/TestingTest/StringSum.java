package TestingTest;

public class StringSum {

	public static void main(String[] args) {
		int[] n = {1,2,3,4,5};
		for(int i =0; i<n.length;i++) {
			for(int j=0;j<n.length;j++) {
				if(i!=j && i==2*j) {
					System.out.println(true);
				}else {
					System.out.println(false);
				}
			}
		}
		
		
	}

}
