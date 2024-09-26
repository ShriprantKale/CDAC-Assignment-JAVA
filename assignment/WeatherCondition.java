/*Assignment 7: Weather Conditions
Write a program that determines whether it's safe to go outside based on temperature and weather conditions. The conditions to go outside are:
•    Temperature should be between 20°C and 30°C.
•    It should not be raining.
Requirements:
•    Use logical operators && and !.*/
package assignment;
import java.util.Scanner;
public class WeatherCondition {
		private double temp;
		private boolean rain;
		Scanner sc=new Scanner(System.in);
		public void accept() {
			System.out.println("Enter Temperature:");
			temp=sc.nextDouble();
			System.out.println("Is it Raining?");
			String r=sc.next();
			rain=r.equals("yes");
		}
		public void checkWeatherCondition() {
			if((temp<=20 && temp>=30)&& !rain) {
				System.out.println("it's  not safe to go outside..");
			}
			else
				System.out.println("it's safe to go outside");
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WeatherCondition t1=new WeatherCondition();
		t1.accept();
		t1.checkWeatherCondition();
	}

}
