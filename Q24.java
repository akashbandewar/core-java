/*
24.	Write a program to search an element in the array.
*/
import java.util.Scanner;

class Q24{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[5];
		int i,j,temp;
		for(i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("Enter the number to be found in array: ");
		int num = sc.nextInt();
		for(i=0;i<ar.length;i++)
		{
			if(num==ar[i]){
				System.out.println("Element found at index: "+i);
				return;
			}
		}
		System.out.println("Element not found!!!");
	}
}