/*
31.	Create a class Student with 2 data members rno and name. 
Create one method setData() that takes roll number and student name as parameter and stores them in data members rno and name. 
Create one more method showData() to print the data member values. 
Create another class ( main class) StudentDemo that creates Student class object and calls setData() and showData() methods.
*/
import java.util.Scanner;

class Student{
	private int rno;
	private String Sname;
	
	void setData(int rollno, String name){
		rno = rollno;
		Sname = name;
	}
	
	void showData(){
		System.out.println(rno+" "+Sname);
	}
}

class Q31{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		s1.setData(10,"Akash");
		s1.showData();
		Student s2 = new Student();
		s2.setData(16,"Aman");
		s2.showData();
	}
}

//	System.out.println("Enter the length of array: ");