package in.java.cdac;

import java.util.Scanner;
class VehicleInfo{
	String name;
	int num;
	String color;
	
}


public class Vehicle {
	public void vehicalInfo(String name1) {
		System.out.println("This is a "+" "+name1+" "+"car.");
		
	}
	public void vehicalInfo(String name1,String color1) {
		System.out.println("This is a "+" "+name1+" "+color1+" "+"car.");
		

}
	public void vehicalInfo(int num1) {
		System.out.println("This is a "+" "+num1+" "+"seater car.");
		

}	
	public void vehicalInfo(String name1,String color1,int num1) {
	System.out.println("This is a "+" "+name1+" "+color1+" "+num1+" "+"seater car.");
	

}


	
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
	    Vehicle car=new Vehicle();
	    
	    car.vehicalInfo("TATA");
	    car.vehicalInfo("Nexon","Black");
	    car.vehicalInfo("Hyundai","White",5);
	    car.vehicalInfo(4);
	 
	    
		
		
	}
	
		}

