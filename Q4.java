/*
04.	Write a program that initializes 2 byte type of variables. 
Add the values of these variables and store in a byte type of variable. 
[Note: primitive down casting is required in this program ] .
*/

class Q4{
	public static void main(String args[]){
		byte a = 110;
		byte b = 30;
		byte res = (byte)(a + b);
		System.out.println("res ="+res);
	}
}