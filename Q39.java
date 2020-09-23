/*
39.	Create class Product with three data members (pid, price, quantity) and parameterized constructor that takes values for all three data members.  
Create a main method in different class (say ProductDemo) and perform following task:
a. Accept information for five Product objects from user and store objects in an array
b. Find pid of product with highest price. 
c. Create a static method (with array of product’s object as argument) in Product class to calculate and return total amount spent on all products. 
( amount spent on single product = price of product * quantity of product )


*/
import java.util.Scanner;
import java.lang.Math;

class Product{
	private int pid;
	private double price;
	private int quantity;
	
	Product(int pid, double price, int quantity){
		this.pid=pid;
		this.price=price;
		this.quantity=quantity;
	}
	
	int getPid(){
		return pid;
	}
	
	double getPrice(){
		return price;
	}
	
	int getQuantity(){
		return quantity;
	}

	static double totalAmount(Product arr[]){
		double total = 0;
		for(int i=0;i<arr.length;i++){
			total+=(arr[i].getPrice()*arr[i].getQuantity());
		}
		return total;
	}	
}

class Q39{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Product arr[] = new Product[5];
		for(int i=0;i<5;i++){
			System.out.print("Enter the pid, price and quantity for product "+(i+1)+": ");
			int pid = sc.nextInt();
			double price = sc.nextDouble();
			int quantity = sc.nextInt();
			Product p = new Product(pid,price,quantity);
			arr[i]=p;
		}
		int pid=0;
		double price = 0;
		for(int i=0;i<arr.length;i++){
			if(arr[i].getPrice()>price){
				price = arr[i].getPrice();
				pid= arr[i].getPid();
			}
		}
		System.out.println("\n\nPid of product with highest price is: "+pid+"\nhaving price of: "+price);
		
//total amount spent om all products
		double total = Product.totalAmount(arr);
		System.out.println("\n\ntotal amount spent on all products is: "+total);
	}
}
//		System.out.println("Int: "+Int+"\nFloat: "+Float+"\nArray: "+Array+"\nMix: "+Mix);
//	System.out.println("Enter the length of array: ");