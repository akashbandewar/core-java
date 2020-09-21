/*
27.	Write a program to find the smallest and greatest number present in the array of integer type.
*/
import java.util.Scanner;

class Q27{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of array: ");
		int arrLen = sc.nextInt();
		int arr[] = new int[arrLen];
		int i,smallest=0,greatest=0;
		System.out.println("Enter array elements: ");
		for(i=0;i<arr.length;i++){
			System.out.println("Element "+(i+1)+": ");
			arr[i] = sc.nextInt();
			if(i==0){
				smallest=arr[i];
				greatest=arr[i];
			}	
			if(smallest>arr[i])
				smallest=arr[i];
			if(greatest<arr[i])
				greatest=arr[i];
		}
		System.out.print("Array elements: ");
		for(i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
		System.out.println("\n\nGreatest and smallest elements in the array are "+greatest+" and "+smallest+" respectively");
	}
}