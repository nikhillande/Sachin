package myFirstProject;

public class Greater_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a =235;
		int b=590;
		int c=100;
		if(a>b && b>c)
			{
			System.out.println("largest number is" +a);
			}
		if(b>a && c>b)
		{
			System.out.println("largest number is "+b);
		}
		if(c>a && c>b)
		{
			System.out.println("largest number is" +c);
		}
	}

}
