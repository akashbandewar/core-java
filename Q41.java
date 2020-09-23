/*
41.	Write a program to demonstrate this() construct functionality.
*/
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

class Student{
	
	Student(){
		System.out.println("zero para constructor");
	}
	
	Student(int i){
		this();
		System.out.println("one para constructor");
	}
	
}

class Q41{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int i = 5;
		Student s = new Student(i);
	}
}
//		System.out.println("Int: "+Int+"\nFloat: "+Float+"\nArray: "+Array+"\nMix: "+Mix);
//	System.out.println("Enter the length of array: ");