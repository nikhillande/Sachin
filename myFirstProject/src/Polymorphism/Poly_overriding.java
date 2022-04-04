package Polymorphism;

public class Poly_overriding extends ploy_overloading{
	
	public void m1() {
		System.out.println("I m from overriding");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Poly_overriding obj= new Poly_overriding();
		obj.m1();
		ploy_overloading obj1= new ploy_overloading();
		obj1.m1();
	
	}

}
