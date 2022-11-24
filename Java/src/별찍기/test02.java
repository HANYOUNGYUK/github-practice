package 별찍기;

public class test02 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			for(int j=10; j>i; j--) {
				System.out.print(" ");
			}	
			for(int m=1; m<i+1; m++) {
				System.out.print("*");
			}
			System.out.println();
			}
	}

}
