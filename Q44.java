/*
44.	Create three classes
-	Faculty with two data members facultyId and salary and two methods, one intput() method for accepting facultyId as input and 
another printSalary() to print salary.

-	FullTimeFaculty that inherits class Faculty with two data members’ basicSalary and allowance. 
Override input() method in this class that calls super class inut() method and accepts basicSalary and allowance as input. 
Salary should not be accepted as input but should be calculated using formula (basicSalary + allowance)

-	PartTimeFaculty that inherits class Faculty with two data members’ workingHours, ratePerHour. 
Override input() method in this class that calls super class inut() method and accepts workingHours and ratePerHour as input. 
Salary should not be accepted as input but should be calculated using formula ( workingHour * ratePerHour )
*/

import java.util.*;

class Faculty{
	private int facultyId;	
	private int salary;
	
	void input(int facultyId){
		this.facultyId=facultyId;
	}
	
	void setSalary(int salary){
		this.salary=salary;
	}

	void printSalary(){
		System.out.println("\nFaculty ID: "+facultyId+"\nSalary: "+salary);
	}
}

class PartTimeFaculty extends Faculty{
	private int workingHours;
	private int ratePerHour;
	
	void input(int facultyId, int workingHours, int ratePerHour){
		super.input(facultyId);
		this.ratePerHour=ratePerHour;
		this.workingHours=workingHours;
		setSalary(workingHours*ratePerHour);
	}
}

class FullTimeFaculty extends Faculty{
	private int basicSalary;
	private int allowance;
	
	void input(int facultyId, int basicSalary, int allowance){
		super.input(facultyId);
		this.basicSalary=basicSalary;
		this.allowance=allowance;
		setSalary(basicSalary + allowance);
	}
}

class Q44{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		FullTimeFaculty obj1 = new FullTimeFaculty();
		obj1.input(1,10000,1200);
		PartTimeFaculty obj2 = new PartTimeFaculty();
		obj2.input(2,4,800);
		obj1.printSalary();
		obj2.printSalary();
	}
}