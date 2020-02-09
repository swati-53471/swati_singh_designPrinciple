package calculator;

import java.util.Scanner;

class Calc {

	public static void main(String[] args) {
		
		char ch,option;
		System.out.println("--------CALCULATOR---------\n\n");
		do 
		{
		System.out.println("Choose an operation : '+' , '-' , '*' , '/'");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
		
		switch (ch)
		{
		case '+':
			Addition a=new Addition();
			break;
		case '-':
			Subtraction s=new Subtraction();
			break;
		case '*':
			Multiplication m=new Multiplication();
			break;
		case '/':
			Division d=new Division();
			break;
		default:
			System.out.println("Invalid Symbol!! Please try again!");
		
		}
		System.out.println("Do you want to continue? y/n");
		option=sc.next().charAt(0);
		}
		while(option=='y');
		if(option!='y')
			System.exit(0);
	}

}
