package Assignment02;

public class Pattern10 {

	public static void main(String args[]) {
		int row = 5;
		int col = 5;

		for (int i = 1; i <= row; i++) {

			for (int j = 1; j <= i; j++) {
				if(i%2==0) {
					System.out.print(0);
				}else {
					System.out.print(1);
				}
				
			}
			System.out.println();
		}
	}

}
