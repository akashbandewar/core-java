/*
43.	Create a class OneBHK with instance variables roomArea, hallArea and price. 
Then create default constructor that initializes instance variables with some values and a parameterized constructor that takes values for 
all instance variables and stores them in instance variables. Now create a method named show()  to print OneBHK’s instance variable values.

Create another class TwoBHK which has (inherites) all the properties and behaviors of OneBHK and a new instance variable room2Area. 
Then create default constructor to initialize all 4 instance variables and a parameterized constructor to take the values for initialization of 
all instance variables. Override show() method to print all data member information.

Write main method in another class (Say Demo) and store three TwoBHK flat’s information and print information using show method. 
Also print total amount of all flats.
*/

import java.util.*;

class oneBHK{
	private double roomArea;	
	private double hallArea;
	private double price;
	
	oneBHK(){
		roomArea=0;
		hallArea=0;
		price=0;
	}
	
	oneBHK(double roomArea, double hallArea, double price){
		this.roomArea=roomArea;
		this.hallArea=hallArea;
		this.price=price;
	}

	void show(){
		System.out.println("\nRoom Area: "+roomArea+"\nHall Area: "+hallArea+"\nprice: "+price);
	}
}

class TwoBHK extends oneBHK{
	private double room2Area;
	
	TwoBHK(double roomArea, double hallArea, double price, double room2Area){
		super(roomArea, hallArea, price);
		this.room2Area = room2Area;
	}
	
	void show(){
		super.show();
		System.out.println("Room 2 Area: "+room2Area);
	}
}

class Q43{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		TwoBHK obj1 = new TwoBHK(10,10,1000,20);
		TwoBHK obj2 = new TwoBHK(12,15,1000,20);
		TwoBHK obj3 = new TwoBHK(11,15,1000,15);
		obj1.show();
		obj2.show();
		obj3.show();
	}
}