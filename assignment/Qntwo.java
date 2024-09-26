package assignment;
import java.util.Scanner;

public class Qntwo {

	
			private int sub1,sub2,sub3;
		
		private double avg;
		
		Scanner sc = new Scanner(System.in);
		void set() {
			System.out.println("Enter the sub1, sub2 and sub3");
			sub1=sc.nextInt();
			sub2=sc.nextInt();
			sub3=sc.nextInt();
			avg=(sub1+sub2+sub3)/3;
		
		}
		void check() {
			if(avg>=60 && sub1 >=40&&sub2>=40&&sub3>=40) {
				System.out.println("student is passed");
			}else {
				System.out.println("student failed");
			}
		}

		public static void main(String[] args) {
			Qntwo e = new Qntwo();
			e.set();
			e.check();
			
		

	}

}
