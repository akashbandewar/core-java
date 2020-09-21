/*
09.	Write a program to read the days (eg. 670 days) as integer value using Scanner class. 
Now convert the entered days into complete years, months and days and print them.
*/
import java.util.Scanner;

class Q9{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int days = sc.nextInt();
		int year,month,day,temp;
		year = days/365;
		temp = days%365;
		month = (temp)/30;
		temp = temp%30;
		day = temp;
		System.out.println(year+" years,"+month+" months and "+day+"days");
	}
}