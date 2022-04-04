package com.infosys.nikhil;

public class switchOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char operation='/';
		int num1=10;
		int num2=20;
		
		switch(operation){
	
		case '+':
			System.out.println("addition of number is " +(num1 + num2));
			break;
		
		case '-':
			System.out.println("substraction of number is " +(num1 - num2));
		    break;
		
		case '*':
			System.out.println("Multiplication of number is " +(num1 * num2));
			break;
		
		case '/':
			System.out.println(" division of number is " +(num1 / num2));
			break;
		
		default :
			System.out.println("enter valid operation");
			break;
		}
	}

}

