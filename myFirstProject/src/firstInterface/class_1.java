package firstInterface;

public class class_1 implements FirstInterface {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		class_1 obj =new class_1();
		obj.m1();
		obj.m2();
		
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("I m from m1 ");
	}

}
