package myFirstProject;
//22/12/2021
public class Multiplicationpractice {
	public static void add(int a,int b)
		{
			System.out.println("sum :"+(a+b));
		}
		public static void sub(int a,int b)
		{
			System.out.println("diff: "+(a-b));
		}
		public static void div(int a,int b)
		{
			System.out.println("quotient: "+(a/b));
		}
		public static void mul(int a,int b)
		{
			System.out.println("product: "+(a*b));
		}
		public static void modulus(int a,int b) {
			System.out.println("modulus: " +(a%2));
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=20,b=15;
		add(a,b);
		sub(a,b);
		div(a,b);
		mul(a,b);
		

	}

}
