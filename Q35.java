/*
35.	Create a class MathOperation that has four static methods. 
add() method that takes two integer numbers as parameter and returns the sum of the numbers. 
subtract() method that takes two integer numbers as parameter and returns the difference of the numbers. 
multiply() method that takes two integer numbers as parameter and returns the product. 
power() method that takes two integer numbers as parameter and returns the power of first number to second number. 
Create another class Demo (main class) that takes the two numbers from the user and calls all four methods of MathOperation class by providing 
entered numbers and prints the return values of every method.
*/
import java.util.Scanner;
import java.lang.Math;

class MathOperation{	
	static int add(int a, int b){
		return a+b;
	}
	
	static int substract(int a, int b){
		return a-b;
	}
	
	static int multiply(int a, int b){
		return a*b;
	}
	
	static int power(int a, int b){
		int result = Math.pow(a,b);
		return result;
	}
}

class Q35{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		MathOperation obj = new MathOperation();
		System.out.print("Enter 2 numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int sum = obj.add(a,b);
		int difference = obj.substract(a,b);
		int product = obj.multiply(a,b);
		int power = obj.power(a,b);
		System.out.println("Addition: "+sum+"\nDifference: "+difference+"\nproduct: "+product+"\npower: "+power);
	}
}

//	System.out.println("Enter the length of array: ");