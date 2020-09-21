/*
13.	Program to find greatest in 3 numbers. 
[ once using if else statement and then using ternary operator ( logical operator) ]  
*/
import java.util.Scanner;

class Q13{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the values of A, B and C: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if(a > b && a > c){
			System.out.println(a+" is greater");
		}
		else
			System.out.println(((b > c) ? b : c) + " is greater");
	}
}