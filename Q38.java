/*
38.	Create a class Employee with three data members (empNo, salary and totalSalary) and following features.
a.	Only parameterized constructor. [Do not overload the constructor]
b.	totalSalary always represents salary total of all the employees created.
c.	empNo should be auto incremented.
d.	display total employees and totalSalary using a method.
Create another class EmployeeDemo (main class) that creates some Employee objects and calls Employee method to display no. of employees 
and total of their salaries.

*/
import java.util.Scanner;
import java.lang.Math;

class Employee{
	static int empNo;
	private double salary;
	static double totalSalary;
	
	Employee(double salary){
		this.empNo++;
		this.salary=salary;
		totalSalary+=salary;
	}
	
	void show(){
		System.out.println(empNo+" "+totalSalary);
	}
}

class Q38{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Employee e1 = new Employee(5000);
		e1.show();
		Employee e2 = new Employee(10000);
		e2.show();
		Employee e3 = new Employee(15000);
		e3.show();
		Employee e4 = new Employee(25000);
		e4.show();
//		System.out.println("Int: "+Int+"\nFloat: "+Float+"\nArray: "+Array+"\nMix: "+Mix);
	}
}

//	System.out.println("Enter the length of array: ");