/*
29.	Write a program to print the total number of one-D arrays in a two-D array and the number of elements in every one-D array present in the two-D arrays.
*/
import java.util.Scanner;

class Q29{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[][]= new int[3][3];
		int i,j;
		for(i=0;i<arr.length;i++){
			for(j=0;j<arr[i].length;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		System.out.println("Number of rows in array is: "+i);
		for(i=0;i<arr.length;i++){
			System.out.println("The length of row "+(i+1)+" is: "+arr[i].length);
		}
		
	}
}

//	System.out.println("Enter the length of array: ");