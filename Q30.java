/*
30.	Create an integer type 2-D array of size [3X3]. Take the elements from the user and then calculate the sum of the elements present in the diagonal.
*/
import java.util.Scanner;

class Q30{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int arr[][]= new int[3][3];
		int i,j,sum=0;
		for(i=0;i<arr.length;i++){
			for(j=0;j<arr[i].length;j++){
				arr[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<arr.length;i++){
			sum+=arr[i][i];
		}
		System.out.println("Sum of the diagonal elements in array is: "+sum);
	}
}

//	System.out.println("Enter the length of array: ");