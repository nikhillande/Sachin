package Casting;

public class Primitive {
	static int var=5;
	static double var1;
	static byte var2;
	static char var3 = 'a';
	static boolean var4=true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		var1=var;
		var1=var3;
		System.out.println(var1);
		//manually
		var2=(byte) var;//var is explicit
		System.out.println(var2);//max 127
		
		int var10=300;
		var2=(byte) var10;
		System.out.println(var2);
		
		int var12=400;
		var2=(byte) var12;
		System.out.println(var2);
	}

}
