/*
08.	Write a program to find the simple interest. 
Take the principle amount, rate of interest and time from user using Scanner class..
*/
import java.util.Scanner;

class Q8{
	public static void main(String args[]){
		double SI;
		Scanner sc = new Scanner(System.in);
		double P= sc.nextDouble();
		double R= sc.nextDouble();
		double T= sc.nextDouble();
		SI =(P * R * T) / 100;
		System.out.println("Simple Interest is "+SI);
	}
}