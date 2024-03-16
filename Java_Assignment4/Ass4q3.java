package in.java.cdac;
import java.util.*;

/* Create a class Employee with multiple overloaded methods that have different parameter types (e.g.,
int, double, String). Demonstrate calling each overloaded method with appropriate arguments.*/

class Employee{
	
	String name;
	int empid;
	double salary;

	public void display(String s) {
		this.name = s;
		System.out.println("Name	:	"+name);
	}
	
	public void display(String s,int e) {
		this.name = s;
		this.empid = e;
		System.out.println("Name	:	"+name);
		System.out.println("Empid	:	"+empid);
	}
	public void display(String s,int e,double sal) {
		this.name = s;
		this.empid = e;
		this.salary = sal;
		System.out.println("Name	:	"+name);
		System.out.println("Empid	:	"+empid);
		System.out.println("Salary	:	"+salary);

	}	
}

public class Ass4q3 {
	public static void main(String[] args) {
		Employee emp = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter name	:	");
		String str = sc.nextLine();
		
		System.out.print("Enter empid	:	");
		int empid = sc.nextInt();
		
		System.out.print("Enter salary	:	");
		double sal = sc.nextDouble();

		//method call
		
		emp.display(str);
		emp.display(str,empid);
		emp.display(str,empid,sal);
		sc.close();
	}



}
