/*
23.	Write a program to reverse the array elements.
*/
import java.util.Scanner;

class Q23{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[10];
		int arr[] = new int[10];
		int i,j,temp;
		for(i=0;i<10;i++)
		{
			ar[i]=sc.nextInt();
			arr[i]=ar[i];
		}
		for(i=arr.length;i>0;i--)
		{
			ar[10-i]=arr[i-1];
		}
		System.out.print("The reversed array is: ");
		for(i=0;i<10;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}