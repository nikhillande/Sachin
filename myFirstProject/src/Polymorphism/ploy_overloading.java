package Polymorphism;

public class ploy_overloading {
	
	public void m1() {
		System.out.println("I m in m1");
	}
	public void m1(int a) {//m1 n parathesis--method signature
		System.out.println("I m from parametrized m1");
	}
	public void m1(int a,int b) {//m1 n parathesis--method signature
		System.out.println("I m in double parameterized m1");
	}
	public void m1(int a,int b,int c) {//m1 n parathesis--method signature
		System.out.println("I m in triple parameterized m1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ploy_overloading obj=new  ploy_overloading();
		 obj.m1();
		 obj.m1(5);
		 obj.m1(2,3);
		 obj.m1(1,2,3);
		 
	}

}
