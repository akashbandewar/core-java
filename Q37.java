/*
37.	Create a class Person with properties (name and age) with following features. 
a.	Default age of person should be 18.
b.	A person object can be initialized with name and age.
c.	Method to display name and age of person
Create another class PersonDemo ( main class ) that demonstrates the functionalities of Person class by creating Person object and calling methods.
*/
import java.util.Scanner;
import java.lang.Math;

class Person{
	private String name;
	private int age;
	
	Person(){
		age=18;
	}
	
	Person(String name, int age){
		this.name=name;
		this.age=age;
	}
	
	void show(){
		System.out.println(name+" "+age);
	}
}

class Q37{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Person obj = new Person("Akash",26);
		obj.show();
		Person obj1 = new Person();
		obj1.show();
//		System.out.println("Int: "+Int+"\nFloat: "+Float+"\nArray: "+Array+"\nMix: "+Mix);
	}
}

//	System.out.println("Enter the length of array: ");