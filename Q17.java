/*
17.	Write a program to reverse a given number.
*/
import java.util.Scanner;

class Q17{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to be reversed: ");
		int n = sc.nextInt();
		int temp,temp1,num=0;
		temp1=n;
		while(n>0){
			temp = n%10;
			num=num*10+temp;
			n=n/10;
		}
		System.out.println("Reverse of "+temp1+" is: "+num);
	}
}