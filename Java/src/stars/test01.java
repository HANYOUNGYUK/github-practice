package stars;

public class test01 {

	public static void main(String[] args) {

		int number = 10;
		for(int i = 1; i <= number; i++) {
			for(int j = number; j>i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k<=2*i-1; k++)
				System.out.print("*");
			
			for(int n = number; n>i; n--) {
				System.out.print(" ");
			}
			System.out.println();
		}
	
			
		}
	}
