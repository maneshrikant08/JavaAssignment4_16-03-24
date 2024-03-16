package in.java.cdac;

import java.util.Scanner;

class Student{
	String name;
	int rollno;;
	
}

public class Program {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	Student stu1=new Student();
	System.out.println("Enter your name: ");
	stu1.name=in.nextLine();
	System.out.println("Enter your rolllno: ");
	stu1.rollno=in.nextInt();
	System.out.println("Student name is"+" " +stu1.name);
	System.out.println("Student rollno is"+" " +stu1.rollno);
	}
}
