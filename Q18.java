/*
18.	Program to check whether number is prime or not.
*/
import java.util.Scanner;

class Q18{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check whether it is prime or not: ");
		int num = sc.nextInt();
		int flag=0;
		int i;
		for(i=2;i<num/2;i++){
			if((num%i)==0){
				System.out.println(num+" is not a prime number");
				return;
			}
		}
		System.out.println(num+" is a prime number");
	}
}
/*
class Q18{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number to check whether it is prime or not: ");
		int num = sc.nextInt();
		int flag=0;
		int i;
		for(i=2;i<num;i++){
			if((num%i)==0){
				System.out.println(num+" is not a prime number");
				break;
			}
			if(num%i==1){
				flag=1;
			}
		}
		if(i==num && flag ==1)
			System.out.println(num+" is a prime number");
	}
}
*/