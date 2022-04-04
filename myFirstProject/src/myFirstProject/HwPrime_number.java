package myFirstProject;

public class HwPrime_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int num=2;
		int count=0;
		while(i<=num) {
			if(num%i==0) {
				count++;
			}
			i++;
			{
			if(count==2)
			{
				System.out.println("Prime number");
		}
		
		else
			{
				System.out.println("not prime number");
			}
	}
		}


}}