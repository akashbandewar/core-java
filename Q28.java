/*
28.	Initialize one String type of array and print the elements using for each loop.
*/
import java.util.Scanner;

class Q28{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String arr[]= new String[]{"Akash","Akshay","Amol","Aman","Anil"};
		System.out.print("\nElements of array of array: ");
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
}

//	System.out.println("Enter the length of array: ");