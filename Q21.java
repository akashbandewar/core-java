/*
21.	Program to show sum and average of 10 element array. 
Accept array elements from user
*/
import java.util.Scanner;

class Q21{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[10];
		double temp=0;
		for(int i=0;i<10;i++)
		{
			ar[i]=sc.nextInt();
			temp=temp+ar[i];
		}
		System.out.println("Sum of all elements is: "+(int)temp+" and average is: "+(temp/10));	
	}
}