/*
46.	Create a program to demonstrate the use of instanceof operator or secure reference down casting
*/

import java.util.*;

class Student{
	
}

class CollegeStudent extends Student{
	
}


class Q46{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		CollegeStudent obj = new CollegeStudent();
		Student obj1 = new Student();
		if(obj instanceof Student)
			System.out.println("Student instance");
		else
			System.out.println("CollegeStudent instance");
		if(obj1 instanceof Student)
			System.out.println("Student instance");
		else
			System.out.println("CollegeStudent instance");
	}
}