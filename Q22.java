/*
22.	Sort a ten element array in descending order.
*/
import java.util.Scanner;

class Q22{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[10];
		int i,j,temp;
		for(i=0;i<10;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(i=0;i<10;i++)
		{
			for(j=i+1;j<10;j++)
			{
				if(ar[i]<ar[j])
				{
					temp=ar[i];
					ar[i]=ar[j];
					ar[j]=temp;
				}
			}
		}
		System.out.print("The array in descending order: ");
		for(i=0;i<10;i++)
		{
			System.out.print(ar[i]+" ");
		}
	}
}