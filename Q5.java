/*
05.	Write a program that takes user’s name as command line argument and prints Welcome <entered user name>.
*/
import java.util.Scanner;

class Q5{
	public static void main(String args[]){
		/*String str;
		Scanner sc = new Scanner(System.in);
		str = sc.next();
		System.out.println("Welcome "+str);
		*/
		System.out.println("Welcome "+args[0]);
	}
}