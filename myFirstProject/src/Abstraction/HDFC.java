package Abstraction;

public class HDFC extends RBI{
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDFC obj = new HDFC();
		obj.pin();
		obj.card_detail();
				
				
	}

	@Override
	public void card_detail() {
		// TODO Auto-generated method stub
		System.out.println("Card released after complete trasaction ");
	}

}
