package firstInterface;

public interface FirstInterface {
	//Interface is used to acheive abstraction
	//Abstraction has also a multi-inheritance
	public  static final int var=50;//all var in interface must be final and statics
	
	public void m1();//method inheritance only declaration
	
	public default void m2() {//default need body in interface
		System.out.println("I am from m2 ");
		
	}
	public static void m3() {//static keyword need body for interface
	System.out.println("I am from m3");//Interface static keyword not call by obj
	}
	
}