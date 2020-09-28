/*
47.	Create a program to demonstrate constructor chaining.
*/

import java.util.*;

class Student{
	Student(){
		System.out.println("Base Constructor");
	}
}

class CollegeStudent extends Student{
	CollegeStudent(){
		super();
		System.out.println("Derived Constructor");
	}
}


class Q47{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Student obj1 = new CollegeStudent();
	}
}