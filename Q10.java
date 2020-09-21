/*
10.	Write a program to convert temperature from Fahrenheit to Celsius. 
Take Fahrenheit as input using Scanner class. [ formula : C= 5*(f-32)/9 ].
*/
import java.util.Scanner;

class Q10{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		double tempF = sc.nextDouble();
		double tempC = 5*(tempF-32)/9;
		System.out.println("The temperature in Fahrenheit is "+tempF+" and temperature in Celcius is "+tempC);
	}
}