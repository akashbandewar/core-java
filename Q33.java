/*
33.	Write a program to demonstrate functionalities of this keyword in java. 
*/
import java.util.Scanner;

class Student{
	private int rno;
	private String Sname;
//	public static int count;
	
	void setData(int rno, String Sname){
		this.rno = rno;
		this.Sname = Sname;
	}
	
	void showData(){
		System.out.println(rno+" "+Sname);
	}
}

class Q33{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Student s1 = new Student();
		s1.setData(10,"Akash");
		s1.showData();
		Student s2 = new Student();
		s2.setData(16,"Aman");
		s2.showData();
//		System.out.println("The total objects created for Student class are: "+Student.count);
	}
}

//	System.out.println("Enter the length of array: ");