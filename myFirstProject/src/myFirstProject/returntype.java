package myFirstProject;
//Assignment 6
//1. Create one class having two instance method having int return type and having one int parameter
//2. Add print statment in method body an Call these above method in main

public class returntype {
	public int method1(int a) {
		System.out.println(a);
		return 5;
	}
public int method2(int b) {
	System.out.println(b);
	return 20;

}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		returntype obj=new returntype();
		obj.method1(500);
		obj.method2(400);

	}

}
