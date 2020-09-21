/*
15.	Accept person’s gender (character m for male and f for female), age (integer), 
as input and then check whether person is eligible for marriage or not.
*/

import java.util.Scanner;

public class Q15 {	
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the gender and age: ");
		char sex = sc.next().charAt(0);
		int age = sc.nextInt();
		if(((sex=='F' || sex=='f') && age>=18) || ((sex=='M' || sex=='m') && age>=21)) {
			System.out.println("Eligible for marriage");
		}
		else
		{
			System.out.println("Nikal.. Pehli fursat me nikal");
		}
	}
}


/*
	compilation cmd
	> javac <file>.java
ex:	> javac hello.java
	
	run cmd
	> java <main class>
ex:	> java hello


*/