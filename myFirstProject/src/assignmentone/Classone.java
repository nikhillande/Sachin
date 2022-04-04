package assignmentone;
//Assignment 4
//1. Create one class having two instance method without return type and having one int parameter
//2. Add print statment in method body an Call these above method in main
public class Classone {
	public void method1(int a){
		System.out.println(a);
	}
	private void method2(int b){
		System.out.println(b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Classone obj=new Classone();
obj.method1(5);
obj.method2(10);
	}

}
