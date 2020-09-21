/*
03.	Find the result of following expressions. 
You need to determine the primitive data type of the variable by looking carefully the given expression and initialize variables by any random value.
A. y = x2 + 3x - 7 (print value of y) 
B. y = x++ + ++x (print value of x and y) 
C. z = x++ - --y - --x  +  x++ (print value of x ,y and z)
D. z = x && y || !(x || y)  (print value of z) [ x, y, z are boolean variables ]
*/

class Q3{
	public static void main(String args[]){
		int x = 10;
		System.out.println("Value of x is "+x);
		int y = x*x + 3*x - 7;
		System.out.println("1) Y = x^2 + 3x - 7 = "+y);
		y = x++ + ++x;
		System.out.println("2) Y = x++ + ++x");
		System.out.println("x is "+x+" and y is "+y);
		int z = x++ - --y - --x + x++;
		System.out.println("3) z = x++ - --y - --x + x++");
		System.out.println("x is "+x+", y is "+y+" and z is "+z);
		boolean a = true;
		boolean b = false;
		boolean c = a && b || !(a || b);
		System.out.println("4) z = x && y || !(x || y)");
		System.out.println("z is "+c);
	}
}