/*
06.	Write a program that takes radius of a circle as input. Read the entered radius using Scanner class. 
Then calculate and print the area and circumference of the circle.
*/
import java.util.Scanner;

class Q6{
	public static void main(String args[]){
		double radius;
		Scanner sc = new Scanner(System.in);
		radius = sc.nextDouble();
		double Area = (double)(22/7) * radius * radius;
		double CF = (double)(2*22/7*radius);
		System.out.println("The Area is "+Area+" and the circumference is "+CF);
	}
}