/*
34.	Create a class Circle that has two data members, one to store the radius and another to store area and 
three methods first init() method to input radius from user, 
second calculateArea() method to calculate area of circle and 
third display() method to display values of radius and area. 
Create class CircleDemo ( main class) that creates the Circle object and calls init(), calculateArea() and display() methods.
*/
import java.util.Scanner;

class Circle{
	private int radius;
	private float area;
	
	void init(int radius){
		this.radius = radius;
	}
	
	void calculateArea(){
		area = (float)(2*radius*22/7);
	}
	
	void display(){
		System.out.println("Area of the circle of radius "+radius+" is: "+area);
	}
}

class Q34{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Circle obj = new Circle();
		System.out.print("Enter the radius of the circle: ");
		int radius = sc.nextInt();
		obj.init(radius);
		obj.calculateArea();
		obj.display();
//		System.out.println("The total objects created for Student class are: "+Student.count);
	}
}

//	System.out.println("Enter the length of array: ");