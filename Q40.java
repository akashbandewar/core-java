/*
40.	Create a class Student having data members name, roll no., age and score. 
Write a program to accept 10 records of student and store them in an array. 
And then arrange the student records based on the score group [0-50], [50-65], [65-80], [80-100]
*/
import java.util.Scanner;
import java.lang.Math;
import java.util.Arrays;

class Student{
	private String name;
	private int age;
	private int rollno;
	private int score;
	
	Student(String name, int age, int rollno, int score){
		this.name=name;
		this.age=age;
		this.rollno=rollno;
		this.score=score;
	}
	
	int getScore(){
		return score;
	}
	
	void show(){
		System.out.println("name: "+name+"\nage: "+age+"\nrollno: "+rollno+"\nscore: "+score);
	}
}

class Q40{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Student arr[] = new Student[5];
		for(int i=0;i<10;i++){
			System.out.print("Enter the name, age, roll number and score for Student "+(i+1)+": ");
			String name = sc.next();
			int age = sc.nextInt();
			int rollno = sc.nextInt();
			int score = sc.nextInt();
			arr[i]= new Student(name,age,rollno,score);
		}
		System.out.println("Records of Students in range of 0 to 50\n");
		for(int i=0;i<arr.length;i++){
			if(arr[i].getScore()>=0 && arr[i].getScore()<=50){
				arr[i].show();
			}
		}
		System.out.println("Records of Students in range of 51 to 65\n");
		for(int i=0;i<arr.length;i++){
			if(arr[i].getScore()>=51 && arr[i].getScore()<=65){
				arr[i].show();
			}
		}
		System.out.println("Records of Students in range of 66 to 80\n");
		for(int i=0;i<arr.length;i++){
			if(arr[i].getScore()>=66 && arr[i].getScore()<=80){
				arr[i].show();
			}
		}
		System.out.println("Records of Students in range of 81 to 100\n");
		for(int i=0;i<arr.length;i++){
			if(arr[i].getScore()>=81 && arr[i].getScore()<=100){
				arr[i].show();
			}
		}
	}
}
//		System.out.println("Int: "+Int+"\nFloat: "+Float+"\nArray: "+Array+"\nMix: "+Mix);
//	System.out.println("Enter the length of array: ");