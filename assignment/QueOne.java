package assignment;
import java.util.Scanner;

public class QueOne {
	private int age;
	private double income;
	private String name;

	Scanner sc=new Scanner(System.in);
	
	public void set() {
			System.out.println("Enter the age of person");
			age=sc.nextInt();
			System.out.println("Enter the income of person");
			income=sc.nextDouble();
			System.out.println("Enter the name of person");
			name=sc.next();
	}
	
	public void check() {
	if(age>=18 && age<=60 && income>=25000) {
		System.out.println("person age is valid");
	}else if(age<0){
		System.out.println(" person age is not valid because value is negativie");
	}else {
		System.out.println("Person age is not valid");
		
	}

}


public static void main(String args[]) {
	QueOne shree=new QueOne();

	shree.set();
	shree.check();
	
	
}
}
