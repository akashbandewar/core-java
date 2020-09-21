/*
20.	Print all prime numbers between two given numbers. [ break continue ]
*/

import java.util.Scanner;

class Q20{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter 2 numbers(range to find the prime numbers) : ");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int flag=0;
		int i,j;
		for(j=num1;j<num2;j++)
		{
			for(i=2;i<j;i++){
				if((j%i)==0){
//					System.out.println(num+" is not a prime number");
					break;
				}
				if(j%i==1){
					flag=1;
				}
			}
			if(i==j && flag ==1)
				System.out.println(j+" is a prime number");
		}
	}
}