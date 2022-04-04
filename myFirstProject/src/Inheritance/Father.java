package Inheritance;

public class Father extends Grandfather {
	public void m2() {//this is single level inheritance
		System.out.println("I modifier this house");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father obj=new Father();
		obj.m2();
		obj.m1();
	}

}
