/*
36.	Create a class MathOperation containing overloaded methods ‘multiply’ to calculate multiplication of following arguments. 
a.	 two integers 
b.	 three floats 
c.	 all elements of array 
d.	one double and one integer 

*/
import java.util.Scanner;
import java.lang.Math;

class MathOperation{	
	static int multiply(int a, int b){
		return a*b;
	}
	
	static float multiply(float a, float b, float c){
		return a*b*c;
	}
	
	static int multiply(int arr[]){
		int res = 1;
		for(int i=0;i<arr.length;i++){
			res*=arr[i];
		}
		return res;
	}
	
	static double multiply(double a, int b){
		return a*b;
	}
}

class Q36{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		MathOperation obj = new MathOperation();
		int Int = obj.multiply(2,3);
		float Float = obj.multiply(2.5f,3.0f,5.2f);
		int arr[]= {1,2,3,4,5};
		int Array = obj.multiply(arr);
		double Mix = obj.multiply(2.5,10);
		System.out.println("Int: "+Int+"\nFloat: "+Float+"\nArray: "+Array+"\nMix: "+Mix);
	}
}

//	System.out.println("Enter the length of array: ");