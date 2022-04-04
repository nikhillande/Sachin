package Inheritance;

public class hybridInherit extends Father {
	public void m4(){
		
		System.out.println("I m daughter of father");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		hybridInherit obj= new hybridInherit();
		obj.m1();
		obj.m2();
		obj.m4();

	}

}
