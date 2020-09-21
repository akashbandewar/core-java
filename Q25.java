/*
25.	Write the program to find the sum of even elements and sum of odd elements present in the array of integer type.
*/
import java.util.Scanner;

class Q25{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int ar[] = new int[5];
		int i,j,even=0,odd=0;
		for(i=0;i<ar.length;i++)
		{
			ar[i]=sc.nextInt();
		}
		for(i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0){
				even=even+ar[i];
			}
			else
				odd=odd+ar[i];
		}
		System.out.println("total of even and odd elements are:"+even+" and "+odd+" respectively");
	}
}