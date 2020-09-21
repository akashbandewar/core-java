/*
19.	Calculate  series : 12+22+32+42+.........+n2
*/

import java.util.Scanner;

class Q19{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int n = sc.nextInt();
		int num=0;
		int temp=n*10+2;
		while(temp>=12){
			num=num+temp;
			temp=temp-10;
		}
		System.out.println("The sum is: "+num);
	}
}