/*
07.	Write a program to calculate sum of 5 subject’s marks & find percentage. 
Take the obtained marks from user using Scanner class. 
Output should be in this format [ percentage marks = 99 % ]. 
Use concatenation operator here.
*/
import java.util.Scanner;

class Q7{
	public static void main(String args[]){
		double avg;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the marks of 5 subjects: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		int e = sc.nextInt();
		avg = (double)(a+b+c+d+e)/5;
		System.out.println("The average is "+avg);
	}
}