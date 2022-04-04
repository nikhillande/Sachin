package myFirstProject;

public class RelationalOperator {
	
	public void greaterthan(int a,int b) {
		System.out.println("a is greater than b " +(a>b));
	}
	public void lessthan(int a,int b) {
		System.out.println("a is less b "+(a<b));
	}
	public void equal(int a,int b){
		System.out.println("a is equal to b "+(a==b));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RelationalOperator obj= new RelationalOperator();
		obj.greaterthan(2,5);
		obj.lessthan(3,4);
		obj.equal(3, 3);
	}

}
