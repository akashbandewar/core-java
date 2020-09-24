/*
45.	Create a class Student with two members : rollno and percentage. 
Create default and parameterized constructors. 
Create method show() to display information. 

Create another class CollegeStudent inherits Student class. 
Add a new member semester to it. Create default and parameterized constructors. 
Also override show() method that calls super class show() method and displays semester. 

Create another class SchoolStudent inherits Student class. 
Add a new member className(eg 12th ,10th etc.) to it. 
Create default and parameterized constructors. 
Also override show() method that calls super class show() method and displays className. 

Create a class( say Demo) with main method that carries out the operation of the project : 
-- has array to store objects of any class(Student,  CollegeStudent or SchoolStudent) 
--create two CollegeStudent  and three SchoolStudent objects and store them inside the array 
-- display all records from the array 
-- search record on the basic of rollno and check given rollno is of SchoolStudent or of CollegeStudent. 
--count how many students are having A grade, if for A grade percentage >75. 
*/

import java.util.*;

class Student{
	private int rollno;	
	private int percentage;
	
	Student(){
		rollno=0;
		percentage=0;
	}
	
	Student(int rollno, int percentage){
		this.rollno=rollno;
		this.percentage=percentage;
	}
	
	void show(){
		System.out.println("\nRoll Number: "+rollno+"\nPercentage: "+percentage);
	}
}

class CollegeStudent extends Student{
	String semester;
	
	CollegeStudent(){
		semester=null;
	}
	
	CollegeStudent(String semester, int rollno, int percentage){
		super(rollno, percentage);
		this.semester=semester;
	}
	
	void show(){
		super.show();
		System.out.println("Semester: "+semester);
	}
}

class SchoolStudent extends Student{
	String className;
	
	SchoolStudent(){
		className=null;
	}
	
	SchoolStudent(String className, int rollno, int percentage){
		super(rollno, percentage);
		this.className=className;
	}
	
	void show(){
		super.show();
		System.out.println("Class Name: "+className);
	}
}

class Q45{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Student arr[] = new Student[5];
		arr[0] = new CollegeStudent("Semester 1",101,75);
		arr[1] = new CollegeStudent("Semester 3",102,65);
		arr[2] = new SchoolStudent("Standard 5th", 505, 90);
		arr[3] = new SchoolStudent("Standard 3rd", 312, 95);
		arr[4] = new SchoolStudent("Standard 10th", 1010, 78);
		for(int i=0;i<5;i++){
			arr[i].show();
		}
	}
}