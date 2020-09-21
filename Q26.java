/*
26.	Create an array of 17 elements in 5 rows.  And calculate sum of all elements.
*/
import java.util.Scanner;

class Q26{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int a1[] = {1,2,3};
		int a2[] = {2,4,6};
		int a3[] = new int[]{4,8,1,3,5};
		int a4[] = new int[]{4,8,1,3,5};
		int a5[] = new int[]{4,8,1,3,5};
		int ar[][] = new int[5][];
		ar[0]=a1;
		ar[1]=a2;
		ar[2]=a3;
		ar[3]=a4;
		ar[4]=a5;
		int sum = 0;
		for(int i=0;i<ar.length;i++){
			for(int j=0;j<ar[i].length;j++){
				System.out.print(ar[i][j]+" ");
//				static int sum = 0;
				sum+=ar[i][j];
			}
			System.out.println("\n"+"sum is: "+sum);
		}
		System.out.println("Sum of all the elemetns in array is: "+sum);
	}
}