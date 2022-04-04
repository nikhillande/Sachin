package Inheritance;

public class multilevel extends Father{
	
	public void m3() {
		System.out.println("I m son of Father");
	}
	
	public static void main(String[] args) {
		multilevel obj= new multilevel();
		obj.m1();
		obj.m2();
		obj.m3();
	}
}
