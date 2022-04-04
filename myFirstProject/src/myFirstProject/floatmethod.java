package myFirstProject;
//Assignment 5

//1. Create another class having two static method without return type and having one float parameter
//2. Add print statment in method body an Call these above method in main

public class floatmethod {
	public void method1(float a) {
		System.out.println(a);
	}
	private void method2(float b) {
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		floatmethod obj=new floatmethod();
		obj.method1(5.5f);
		obj.method2(10.20f);
	}

}