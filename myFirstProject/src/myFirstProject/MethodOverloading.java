package myFirstProject;
//21/12/2021
public class MethodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("I am from java main ");
		MethodOverloading.main(3);
		MethodOverloading obj = new MethodOverloading();
		obj.square(12f, 23f);
	}
//Whether we can overload the main method
		public static void main(int a) {
			System.out.println("Iam from programmer main ");                            
		}
public void square(double b, double c) {
	double a=b*c;
	System.out.println("Iam try to multiply "+a);	
}
}

